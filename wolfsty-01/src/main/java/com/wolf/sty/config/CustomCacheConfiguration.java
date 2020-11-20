package com.wolf.sty.config;

/**
 * Created by user on 2020/9/24.
 */

import com.wolf.sty.annotation.CustomCache;
import com.wolf.sty.redis.CommonRedisDao;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.core.ParameterNameDiscoverer;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 首先要在spring启动类开启切面编程
 *
 * @author Administrator
 */

@Component
@Aspect
public class CustomCacheConfiguration {
    @Autowired
    private CommonRedisDao commonRedisDao;

    //定义一个方法 使用注解触发这个缓存方法
    //@annotation()这是一个语法,当出现这个注解的时候触发该方法
    @Around("@annotation(com.wolf.sty.annotation.CustomCache)")
    public Object queryCache(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法执行之前-----增强");
        //获取查询的key  连接点是在方法上的,所以可以强转成方法的签名信息
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //获取被注解注释的方法
        Method method = joinPoint.getTarget().getClass().getMethod(signature.getName(), signature.getMethod().getParameterTypes());
        CustomCache customCache = method.getAnnotation(CustomCache.class);
        //获取注解中的key
        String ELkey = customCache.key();
        String pre = customCache.pre();
        boolean refresh = customCache.refresh();
        //通过注解中的el表达式获取参数中的值
        //1.创建表达式
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression(ELkey);
        //2.设置解析上下文(有哪些占位符以及占位符的值)
        EvaluationContext context = new StandardEvaluationContext();
        Object[] args = joinPoint.getArgs();//获取方法里的参数值
        //获取方法真实参数名
        ParameterNameDiscoverer parameterNameDiscoverer = new DefaultParameterNameDiscoverer();
        String[] parameterNames = parameterNameDiscoverer.getParameterNames(method);
        //将方法的参数名和参数值设置在解析器里
        for (int i = 0; i < parameterNames.length; i++) {
            context.setVariable(parameterNames[i], args[i]);
        }
        //获取将占位符替换成真实参数后的key
        String key = expression.getValue(context).toString();
        //判断是否需要清除缓存
        if (!refresh) {
            //查询redis中是否存在
            boolean hasExits = commonRedisDao.exists(pre + key);
            if (hasExits) {
                System.out.println("查询到缓存,直接从缓存中获取");
                return commonRedisDao.get(pre + key);
            } else {
                //代表执行带注解的方法,不执行这一行代表不执行被CustomCache注解的方法
                Object proceed = joinPoint.proceed();
                System.out.println("方法执行之后-----增强");
                //不存在则将数据添加到redis中
                if (proceed instanceof String) {
                    commonRedisDao.set(pre + key, (String) proceed);
                }
                return proceed;
            }
        } else {
            commonRedisDao.del(pre + key);
            //代表执行带注解的方法,不执行这一行代表不执行被CustomCache注解的方法
            Object proceed = joinPoint.proceed();
            System.out.println("方法执行之后-----增强");
            return proceed;
        }
    }
}
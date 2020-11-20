package com.wolf.sty.test;

import com.wolf.sty.bean.User;
import com.wolf.sty.config.ConfigUser;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by user on 2020/9/18.
 */
public class WolfSty01 {

    public static void main(String[] args) {
//        ApplicationContext ctx =new AnnotationConfigApplicationContext(ConfigUser.class) ;
//        User user= ctx.getBean(User.class) ;
//        System.out.println(user.getId());
        testInteger();
    }

    @Test
    public  void test(){
        testInteger();
    }

    public static void testInteger(){
        Integer intVal = 123;
        int intVal2 = 123;
        Integer intVal3 = new Integer(123);
        if(intVal <= intVal3){
            System.out.println("intVal <= intVal3");
        }
        if(intVal.intValue() == intVal3.intValue()){
            System.out.println("intVal == intVal3");
        }
        System.out.println(intVal==intVal2);
        System.out.println(intVal==intVal3);
        System.out.println(intVal2==intVal3);
    }
}

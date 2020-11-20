package com.wolf.sty.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mapper扫描配置，让mapper装配到beanFactory
 *
 * @author zw
 * @version 1.0
 * @date 2019-08-16
 */
@Configuration
@MapperScan("com.wolf.**.mapper")
public class MybatisPlusConfig {


    /**
     * 分页拦截器
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}

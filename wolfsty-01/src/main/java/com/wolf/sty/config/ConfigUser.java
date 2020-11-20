package com.wolf.sty.config;

import com.wolf.sty.bean.User;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;
import java.util.UUID;

/**
 * Created by user on 2020/9/17.
 */
//这标识此类为一个配置文件类
@Configuration
public class ConfigUser {

    @Bean(name = "user")
    public User initUser() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setUserName("正显示");
        user.setAddress("四川省成都市");
        return user;
    }

//    @Bean(name = "dataSource")
//    public DataSource getDataSource() {
//        Properties props = new Properties();
//        props.setProperty("driver", "com.mysql.jdbc.Driver");
//        props.setProperty("url", "jdbc:mysql://localhost:3306/chapter3");
//        props.setProperty("username", "root");
//        props.setProperty("password", "root");
//        DataSource dataSource = null;
//        try {
//            dataSource = BasicDataSourceFactory.createDataSource(props);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return dataSource;
//    }
}

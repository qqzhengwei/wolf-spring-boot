package com.wolf.sty.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by user on 2020/9/21.
 */
@Component
@AutoConfigureBefore(DataSourceAutoConfiguration.class)
@ConfigurationProperties(prefix ="database")
public class JdbcBean {

    @Value("driverName")
    private String driverName;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        System.out.println("==========="+driverName);
        this.driverName = driverName;
    }
}

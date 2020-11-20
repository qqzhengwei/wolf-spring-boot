package com.wolf.sty.sty;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by user on 2020/11/15.
 */
public class LoadProperty {
    private static Properties prop = new Properties();

    static {
        InputStream in = LoadProperty.class.getClassLoader().getResourceAsStream("ysyPay.properties");
        try {
            prop.load(in);
        } catch (Exception e) {
        }
    }
}

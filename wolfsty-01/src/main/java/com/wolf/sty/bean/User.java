package com.wolf.sty.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2020/9/17.
 */
@Data
public class User {

    private String id;

    private String userName;

    private String age;

    private String phone;

    private String address;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date date;
    /**app类型#android、ios、wx-xcx#*/
    private String app;
    /**app版本号#3.3.1#*/
    private String appVersion;

    private List<Map> proList;

}

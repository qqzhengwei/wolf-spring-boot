package com.wolf.sty.bean.md;

import lombok.Data;

import java.util.Date;

/**
 * Created by user on 2020/10/16.
 */
@Data
public class BaseConfigData extends BaseSysData {
    /**应用ID*/
    private String appId;
    /**用户ID*/
    private String userId;
    /**app类型#android、ios#*/
    private String $app;
    /**app版本号#3.3.1#*/
    private String $appVersion;
    /**sdk类型#android、ios#*/
    private String $sdk;
    /**sdk版本号#3.3.1#*/
    private String $sdkVersion;
    /**客户端请求IP地址*/
    private String $ip;
    /**经度*/
    private String $lng;
    /**纬度*/
    private String $lat;
    /**进入记录时间*/
    private Date inRecordTime;
    /**离开记录时间*/
    private Date outRecordTime;
    /**停留时长（毫秒）*/
    private Integer stopMs;
    /**上报时间*/
    private Date ts;
    /**是否首日访问*/
    private Boolean isFirstDay;
    /**是否首次启动*/
    private Boolean isFirstRunTime;
    /**页面标题*/
    private String title;
    /**向前地址*/
    private String forwardPage;
    /**向后地址*/
    private String backwardPage;

}

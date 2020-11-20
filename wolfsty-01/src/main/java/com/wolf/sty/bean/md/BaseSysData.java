package com.wolf.sty.bean.md;

import lombok.Data;

/**
 * Created by user on 2020/10/16.
 */
@Data
public class BaseSysData {
    /**设备ID
     * （IOS）IDFA、IDFV 或者 UUID
     * （Android）IMEI ->OAID -> ANDROID_ID*/
    private String $deviceId;
    /**设备制造商#apple、华为、小米#*/
    private String $manufacturer;
    /**设备型号#phone6、华为P9#*/
    private String $modelVersion;
    /**操作系统#IOS、android#*/
    private String $os;
    /**操作系统版本#8.1.1/1.1.1#*/
    private String $osVersion;
    /**运营商名称（获取SM卡）#电信、移动、联通#*/
    private String $carrier;
    /**网络类型#wifi、5G、4G、3G#*/
    private String $networkType;
    /**屏幕宽*/
    private String $screenWidth;
    /**屏幕高*/
    private String $screenHeight;
    /**浏览器名#Chrome#*/
    private String $browser;
    /**浏览器版本#Chrome 45#*/
    private String $browserVersion;
}

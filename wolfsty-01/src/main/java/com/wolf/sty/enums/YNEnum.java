package com.wolf.sty.enums;

/**
 * 是否有效的枚举
 *
 * @author Nian.Li
 * @version 1.0
 * @date 2017年2月27日
 */
public enum YNEnum {

    YES("Y", "是"),
    NO("N", "否");

    public String code;
    public String name;

    YNEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.code;
    }

    public static boolean containsValue(String code) {
        for (YNEnum ynEnum : YNEnum.values()) {
            if (ynEnum.code.equals(code)) {
                return true;
            }
        }
        return false;
    }
}

package com.wolf.sty.util;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 验证工具类
 * @author zhengwei
 * @E-mail:qwweeezhengwei@163.com
 * @version 创建时间：2016年10月24日 下午3:59:39
 * 
 */
public class UtilValidate {

    /**
     * 验证一个对象是否非空，支持String,Map,Collection等。
     * @param o
     * @return
     */
    public static boolean isEmpty(Object o){
        return isBaseEmpty(o);
    }

    /**
     * 验证String是否为空
     * @param s
     * @return
     */
    public static boolean isEmpty(String s) {
        return ((s == null) || (s.length() == 0));
    }
    
    /**
     * 验证数组是否为空
     * @param arrays
     * @return
     */
    public static boolean isEmpty(Object[] arrays) {
        return ((arrays == null) || (arrays.length == 0));
    }

    /**
     * 验证一个集合是否为空
     * @param c
     * @param <T>
     * @return
     */
    public static <T> boolean isEmpty(Collection<T> c) {
        return ((c == null) || (c.size() == 0));
    }

    /**
     * 验证Map集合是否为空
     * @param m
     * @param <K>
     * @param <V>
     * @return
     */
    public static <K,V> boolean isEmpty(Map<K,V> m) {
        return ((m == null) || (m.size() == 0));
    }

    /**
     * 验证charsequence是否为空
     * @param c
     * @return
     */
    public static boolean isEmpty(CharSequence c) {
        return ((c == null) || (c.length() == 0));
    }

    /**
     * 验证一个对象是否非空，支持String,Map,Collection等。
     * @param o
     * @return
     */
    public static boolean isNotEmpty(Object o) {
        return !isBaseEmpty(o);
    }

    /**
     * 验证String是否不为空
     * @param s
     * @return
     */
    public static boolean isNotEmpty(String s) {
        return ((s != null) && (s.length() > 0));
    }
    
    /**
     * 验证数组是否为空
     * @param arrays
     * @return
     */
    public static boolean isNotEmpty(Object[] arrays) {
        return ((arrays == null) || (arrays.length > 0));
    }

    /**
     * 验证Collection是否不为空
     * @param c
     * @param <E>
     * @return
     */
    public static <E> boolean isNotEmpty(Collection<E> c) {
        return ((c != null) && (c.size() > 0));
    }

    /**
     * 验证CharSequence是否不能为空
     * @param c
     * @return
     */
    public static  boolean isNotEmpty(CharSequence c) {
        return ((c != null) && (c.length() > 0));
    }

    /**
     * 基类
     * @param value
     * @return
     */
    @SuppressWarnings("unchecked")
	private static boolean isBaseEmpty(Object value) {
        if (value == null) return true;
        if (value instanceof String) return UtilValidate.isEmpty((String) value);
        if (value instanceof Collection) return UtilValidate.isEmpty((Collection<? extends Object>) value);
        if (value instanceof Map) return UtilValidate.isEmpty((Map<? extends Object, ? extends Object>) value);
        if (value instanceof CharSequence) return UtilValidate.isEmpty((CharSequence) value);
        // These types would flood the log
        // Number covers: BigDecimal, BigInteger, Byte, Double, Float, Integer, Long, Short
        if (value instanceof Boolean) return false;
        if (value instanceof Number) return false;
        if (value instanceof Character) return false;
        if (value instanceof java.sql.Timestamp) return false;
        return false;
    }

    /**
     * 手机号验证
     * @param  str
     * @return 验证通过返回true
     */
    public static boolean isMobile(final String str) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][3,4,5,7,8,9][0-9]{9}$"); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }
    /**
     * 电话号码验证
     * @param  str
     * @return 验证通过返回true
     */
    public static boolean isPhone(final String str) {
        Pattern p1 = null, p2 = null;
        Matcher m = null;
        boolean b = false;
        p1 = Pattern.compile("^[0][0-9]{2,3}-[0-9]{5,10}$");  // 验证带区号的
        p2 = Pattern.compile("^[1-9]{1}[0-9]{5,8}$");         // 验证没有区号的
        if (str.length() > 9) {
            m = p1.matcher(str);
            b = m.matches();
        } else {
            m = p2.matcher(str);
            b = m.matches();
        }
        return b;
    }

    public static boolean customValidate(String str, String pattern){
        Pattern p = Pattern.compile(pattern);
        return p.matcher(str).matches();
    }

    /**
     * 是否是身份证号码
     * @param idCard
     */
    public static boolean isIDCard(String idCard){
        String regex="\\d{15}$|^\\d{17}[0-9Xx]$";
        Pattern p = Pattern.compile(regex);
        return p.matcher(idCard).matches();
    }
    /**
     * 是否为数字
     * @param number
     * @return
     */
    public static boolean isNumber(String number){
        String regex="^[1-9]\\d*$";
        Pattern p = Pattern.compile(regex);
        return p.matcher(number).matches();
    }
    /**
     * 系统测试方法
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(isPhone("0830-5855113"));
        //System.out.println(UtilValidate.isEmpty(""));
    }

}

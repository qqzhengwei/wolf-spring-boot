package com.wolf.sty.util;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 类描述：时间操作定义类
 *
 * @author zhengwei
 * @version 创建时间：2016年8月19日 下午5:49:05
 * @E-mail:qwweeezhengwei@163.com
 */
public class DateUtils extends PropertyEditorSupport {
    // 各种时间格式
    public static final SimpleDateFormat month_sdf = new SimpleDateFormat(
            "yyyy-MM");
    public static final SimpleDateFormat month_sdf_cn = new SimpleDateFormat(
            "yyyy年MM月");
    // 各种时间格式
    public static final SimpleDateFormat date_sdf = new SimpleDateFormat(
            "yyyy-MM-dd");
    // 各种时间格式
    public static final SimpleDateFormat yyyyMMdd = new SimpleDateFormat(
            "yyyyMMdd");
    // 各种时间格式
    public static final SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat(
            "yyyyMMddHhmmss");
    // 各种时间格式
    public static final SimpleDateFormat date_sdf_wz = new SimpleDateFormat(
            "yyyy年MM月dd日");
    // 各种时间格式
    public static final SimpleDateFormat date_sdf_wz_hhmm = new SimpleDateFormat(
            "yyyy年MM月dd日 HH:mm");
    public static final SimpleDateFormat time_sdf = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm");
    public static final SimpleDateFormat yyyymmddhhmmss = new SimpleDateFormat(
            "yyyyMMddHHmmss");
    public static final SimpleDateFormat short_time_sdf = new SimpleDateFormat(
            "HH:mm");
    public static final String datetimeFormatString = "yyyy-MM-dd HH:mm:ss";
    public static final String timezoneString = "GMT+8";
    public static final SimpleDateFormat datetimeFormat = new SimpleDateFormat(datetimeFormatString);
    public static final SimpleDateFormat datesdf = new SimpleDateFormat(
            "yyyy.MM.dd");
    public static final SimpleDateFormat date_sdf_yyyymmdd = new SimpleDateFormat(
            "yyyy/MM/dd");
    public static final SimpleDateFormat date_sdf_yyyymmddhhmm = new SimpleDateFormat(
            "yyyy.MM.dd HH:mm");
    public static final SimpleDateFormat date_sdf_mmddhhmm = new SimpleDateFormat(
            "MM-dd HH:mm");
    public static final SimpleDateFormat date_sdf_hhmm = new SimpleDateFormat(
            "HH:mm");
    public static final SimpleDateFormat date_sdf_mmdd_n_yyyy = new SimpleDateFormat("MM/dd\nyyyy");

    public static final SimpleDateFormat date_ymd_hms = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss时");

    // 以毫秒表示的时间
    public static final long DAY_IN_MILLIS = 24 * 3600 * 1000;
    /**
     * 半小时毫秒数
     */
    public static final long HALF_HOUR_IN_MILLIS = 1800 * 1000;

    public static final long HOUR_IN_MILLIS = 3600 * 1000;
    public static final long MINUTE_IN_MILLIS = 60 * 1000;
    public static final long SECOND_IN_MILLIS = 1000;

    // 以秒为单位
    private static final long ONE_MINUTE = 60;
    public static final long ONE_HOUR = 3600;
    public static final long ONE_DAY = 86400;
    public static final long ONE_MONTH = 2592000;
    public static final long ONE_YEAR = 31104000;

    // 指定模式的时间格式
    private static SimpleDateFormat getSDFormat(String pattern) {
        return new SimpleDateFormat(pattern);
    }

    /**
     * 当前日历，这里用中国时间表示
     *
     * @return 以当地时区表示的系统当前日历
     */
    public static Calendar getCalendar() {
        return Calendar.getInstance();
    }

    /**
     * 指定毫秒数表示的日历
     *
     * @param millis 毫秒数
     * @return 指定毫秒数表示的日历
     */
    public static Calendar getCalendar(long millis) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(millis));
        return cal;
    }

    // ////////////////////////////////////////////////////////////////////////////
    // getDate
    // 各种方式获取的Date
    // ////////////////////////////////////////////////////////////////////////////

    /**
     * 当前日期
     *
     * @return 系统当前时间
     */
    public static Date getDate() {
        return new Date();
    }

    /**
     * 指定毫秒数表示的日期
     *
     * @param millis 毫秒数
     * @return 指定毫秒数表示的日期
     */
    public static Date getDate(long millis) {
        return new Date(millis);
    }

    /**
     * 时间戳转换为字符串
     *
     * @param time
     * @return
     */
    public static String timestamptoStr(Timestamp time) {
        // Date date = null;
        // if (null != time) {
        // date = new Date(time.getTime());
        // }
        return date2Str(date_sdf);
    }

    /**
     * 字符串转换时间戳
     *
     * @param str
     * @return
     */
    public static Timestamp str2Timestamp(String str) {
        Date date = str2Date(str, date_sdf);
        return new Timestamp(date.getTime());
    }

    /**
     * 字符串转换成日期
     *
     * @param str
     * @param sdf
     * @return
     */
    public static Date str2Date(String str, SimpleDateFormat sdf) {
        if (null == str || "".equals(str)) {
            return null;
        }
        Date date = null;
        try {
            date = sdf.parse(str);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 日期转换为字符串
     *
     * @param date_sdf 日期
     * @return 字符串
     */
    public static String date2Str(SimpleDateFormat date_sdf) {
        Date date = getDate();
        if (null == date) {
            return null;
        }
        return date_sdf.format(date);
    }

    /**
     * 格式化时间
     *
     * @param date
     * @param format
     * @return
     */
    public static String dateformat(String date, String format) {
        SimpleDateFormat sformat = new SimpleDateFormat(format);
        Date _date = null;
        try {
            _date = sformat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sformat.format(_date);
    }

    /**
     * 日期转换为字符串
     *
     * @param date     日期
     * @param date_sdf 日期格式
     * @return 字符串
     */
    public static String date2Str(Date date, SimpleDateFormat date_sdf) {
        if (null == date) {
            return null;
        }
        return date_sdf.format(date);
    }

    /**
     * 日期转换为字符串
     *
     * @param format 日期格式
     * @return 字符串
     */
    public static String getDate(String format) {
        Date date = new Date();
        if (null == date) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 指定毫秒数的时间戳
     *
     * @param millis 毫秒数
     * @return 指定毫秒数的时间戳
     */
    public static Timestamp getTimestamp(long millis) {
        return new Timestamp(millis);
    }

    /**
     * 以字符形式表示的时间戳
     *
     * @param time 毫秒数
     * @return 以字符形式表示的时间戳
     */
    public static Timestamp getTimestamp(String time) {
        return new Timestamp(Long.parseLong(time));
    }

    /**
     * 系统当前的时间戳
     *
     * @return 系统当前的时间戳
     */
    public static Timestamp getTimestamp() {
        return new Timestamp(new Date().getTime());
    }

    /**
     * 指定日期的时间戳
     *
     * @param date 指定日期
     * @return 指定日期的时间戳
     */
    public static Timestamp getTimestamp(Date date) {
        return new Timestamp(date.getTime());
    }

    /**
     * 指定日历的时间戳
     *
     * @param cal 指定日历
     * @return 指定日历的时间戳
     */
    public static Timestamp getCalendarTimestamp(Calendar cal) {
        return new Timestamp(cal.getTime().getTime());
    }

    public static Timestamp gettimestamp() {
        Date dt = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = df.format(dt);
        Timestamp buydate = Timestamp.valueOf(nowTime);
        return buydate;
    }


    /**
     * 指定日期的默认显示，具体格式：年-月-日
     * 并将分以后的设置为0
     *
     * @param date 指定的日期
     * @return 指定日期按“年-月-日“格式显示
     */
    public static Date formatYyyyMmDdDate(Date date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);//把当前时间小时变成０
        calendar.set(Calendar.MINUTE, 0);//把当前时间分钟变成０
        calendar.set(Calendar.SECOND, 0);// 把当前时间秒数变成０
        calendar.set(Calendar.MILLISECOND, 0);// 把当前时间毫秒变成０
        return calendar.getTime();
    }

    // ////////////////////////////////////////////////////////////////////////////
    // getMillis
    // 各种方式获取的Millis
    // ////////////////////////////////////////////////////////////////////////////

    /**
     * 系统时间的毫秒数
     *
     * @return 系统时间的毫秒数
     */
    public static long getMillis() {
        return new Date().getTime();
    }

    /**
     * 指定日历的毫秒数
     *
     * @param cal 指定日历
     * @return 指定日历的毫秒数
     */
    public static long getMillis(Calendar cal) {
        return cal.getTime().getTime();
    }

    /**
     * 指定日期的毫秒数
     *
     * @param date 指定日期
     * @return 指定日期的毫秒数
     */
    public static long getMillis(Date date) {
        return date.getTime();
    }

    /**
     * 指定时间戳的毫秒数
     *
     * @param ts 指定时间戳
     * @return 指定时间戳的毫秒数
     */
    public static long getMillis(Timestamp ts) {
        return ts.getTime();
    }

    // ////////////////////////////////////////////////////////////////////////////
    // formatDate
    // 将日期按照一定的格式转化为字符串
    // ////////////////////////////////////////////////////////////////////////////

    /**
     * 默认方式表示的系统当前日期，具体格式：年-月-日
     *
     * @return 默认日期按“年-月-日“格式显示
     */
    public static String formatDate() {
        return date_sdf.format(getCalendar().getTime());
    }

    /**
     * 获取当前时间 yyyyMMddHHmmss的时间
     *
     * @return
     */
    public static String formatYearDateTime() {
        return yyyyMMddHHmmss.format(getCalendar().getTime());
    }

    /**
     * 获取时间字符串
     */
    public static String getDataString(SimpleDateFormat formatstr) {
        return formatstr.format(getCalendar().getTime());
    }

    /**
     * 指定日期的默认显示，具体格式：年-月-日
     *
     * @param cal 指定的日期
     * @return 指定日期按“年-月-日“格式显示
     */
    public static String formatDate(Calendar cal) {
        return date_sdf.format(cal.getTime());
    }

    /**
     * 指定日期的默认显示，具体格式：年-月-日
     *
     * @param date 指定的日期
     * @return 指定日期按“年-月-日“格式显示
     */
    public static String formatDate(Date date) {
        return date_sdf.format(date);
    }

    public static Date parseDate(String date) {
        try {
            return date_sdf.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 获取mmdd\n yyyy 格式数据
     *
     * @param date
     * @return
     */
    public static String formatNDate(Date date) {
        return date_sdf_mmdd_n_yyyy.format(date);
    }

    /**
     * 指定毫秒数表示日期的默认显示，具体格式：年-月-日
     *
     * @param millis 指定的毫秒数
     * @return 指定毫秒数表示日期按“年-月-日“格式显示
     */
    public static String formatDate(long millis) {
        return date_sdf.format(new Date(millis));
    }

    /**
     * 指定日期的默认显示，具体格式：年-月
     *
     * @return 指定日期按“年-月“格式显示
     */
    public static String formatMonth() {
        return month_sdf.format(new Date());
    }

    /**
     * 指定日期的默认显示，具体格式：年-月
     *
     * @param date 指定的日期
     * @return 指定日期按“年-月“格式显示
     */
    public static String formatMonth(Date date) {
        return month_sdf.format(date);
    }

    public static String formatMonthCn(Date date) {
        return month_sdf_cn.format(date);
    }

    /**
     * 默认日期按指定格式显示
     *
     * @param pattern 指定的格式
     * @return 默认日期按指定格式显示
     */
    public static String formatDate(String pattern) {
        return getSDFormat(pattern).format(getCalendar().getTime());
    }

    /**
     * 指定日期按指定格式显示
     *
     * @param cal     指定的日期
     * @param pattern 指定的格式
     * @return 指定日期按指定格式显示
     */
    public static String formatDate(Calendar cal, String pattern) {
        return getSDFormat(pattern).format(cal.getTime());
    }

    /**
     * 指定日期按指定格式显示
     *
     * @param date    指定的日期
     * @param pattern 指定的格式
     * @return 指定日期按指定格式显示
     */
    public static String formatDate(Date date, String pattern) {
        return getSDFormat(pattern).format(date);
    }

    // ////////////////////////////////////////////////////////////////////////////
    // formatDateTime
    // 将日期按照一定的格式转化为字符串
    // ////////////////////////////////////////////////////////////////////////////

    /**
     * 默认方式表示的系统当前日期，具体格式：年-月-日 时：分
     *
     * @return 默认日期按“年-月-日 时：分:秒“格式显示
     */
    public static String formatDateTime() {
        return datetimeFormat.format(getCalendar().getTime());
    }

    /**
     * 指定毫秒数表示日期的默认显示，具体格式：年-月-日 时：分:秒
     *
     * @param millis 指定的毫秒数
     * @return 指定毫秒数表示日期按“年-月-日 时：分“格式显示
     */
    public static String formatDateTime(long millis) {
        return datetimeFormat.format(new Date(millis));
    }

    /**
     * 指定日期的默认显示，具体格式：年-月-日 时：分:秒：分
     *
     * @param cal 指定的日期
     * @return 指定日期按“年-月-日 时：分:秒“格式显示
     */
    public static String formatDateTime(Calendar cal) {
        return datetimeFormat.format(cal.getTime());
    }

    /**
     * 指定日期的默认显示，具体格式：年-月-日 时：分
     *
     * @param date 指定的日期
     * @return 指定日期按“年-月-日 时：分:秒“格式显示
     */
    public static String formatDateTime(Date date) {
        return datetimeFormat.format(date);
    }

    public static Date parseDateTime(String date) {
        try {
            return datetimeFormat.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static Date parseTimeSDF(String date) {
        try {
            return time_sdf.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    // ////////////////////////////////////////////////////////////////////////////
    // formatTime
    // 将日期按照一定的格式转化为字符串
    // ////////////////////////////////////////////////////////////////////////////

    /**
     * 默认方式表示的系统当前日期，具体格式：年-月-日 时：分
     *
     * @return 默认日期按“年-月-日 时：分“格式显示
     */
    public static String formatTime() {
        return time_sdf.format(getCalendar().getTime());
    }

    /**
     * 指定毫秒数表示日期的默认显示，具体格式：年-月-日 时：分
     *
     * @param millis 指定的毫秒数
     * @return 指定毫秒数表示日期按“年-月-日 时：分“格式显示
     */
    public static String formatTime(long millis) {
        return time_sdf.format(new Date(millis));
    }

    /**
     * 指定日期的默认显示，具体格式：年-月-日 时：分
     *
     * @param cal 指定的日期
     * @return 指定日期按“年-月-日 时：分“格式显示
     */
    public static String formatTime(Calendar cal) {
        return time_sdf.format(cal.getTime());
    }

    /**
     * 指定日期的默认显示，具体格式：年-月-日 时：分
     *
     * @param date 指定的日期
     * @return 指定日期按“年-月-日 时：分“格式显示
     */
    public static String formatTime(Date date) {
        return time_sdf.format(date);
    }

    /**
     * 指定日期的默认显示，具体格式：年-月-日 时：分
     * 并将分以后的设置为0
     *
     * @param date 指定的日期
     * @return 指定日期按“年-月-日 时：分“格式显示
     */
    public static String formatTimeSetMinuteZero(Date date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.MINUTE, 0);
        //把当前时间分钟变成０
        calendar.set(Calendar.SECOND, 0);
        // 把当前时间秒数变成０
        calendar.set(Calendar.MILLISECOND, 0);
        // 把当前时间毫秒变成０
        return time_sdf.format(calendar.getTime());
    }

    /**
     * 指定日期的默认显示，具体格式：年-月-日 时：分
     * 并将分以后的设置为0
     *
     * @param date 指定的日期
     * @return 指定日期按“年-月-日 时：分“格式显示
     */
    public static Date formatTimeSetSecondZeroReDate(Date date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        //把当前时间分钟变成０
        calendar.set(Calendar.SECOND, 0);
        // 把当前时间秒数变成０
        calendar.set(Calendar.MILLISECOND, 0);
        // 把当前时间毫秒变成０
        return calendar.getTime();
    }

    /**
     * 指定日期的默认显示，具体格式：年-月-日 时：分
     * 并将分以后的设置为0
     *
     * @param date 指定的日期
     * @return 指定日期按“年-月-日 时：分“格式显示
     */
    public static Date formatTimeSetMinuteZeroReDate(Date date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.MINUTE, 0);
        //把当前时间分钟变成０
        calendar.set(Calendar.SECOND, 0);
        // 把当前时间秒数变成０
        calendar.set(Calendar.MILLISECOND, 0);
        // 把当前时间毫秒变成０
        return calendar.getTime();
    }

    /**
     * 保留：年月日 时：分
     * 将秒和毫秒设置为0
     *
     * @param date
     * @return
     */
    public static Date setSecondMillisecondToZero(Date date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.SECOND, 0);// 把当前时间秒数变成０
        calendar.set(Calendar.MILLISECOND, 0); // 把当前时间毫秒变成０
        return calendar.getTime();
    }

    /**
     * 指定日期的默认显示，具体格式：年-月-日 时：分
     * 并将分以后的设置为0
     *
     * @param date 指定的日期
     * @return 指定日期按“年-月-日 时：分“格式显示
     */
    public static Date formatYyyyMmDdZeroDate(Date date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.set(Calendar.YEAR, 0);
        //把当前时间分钟变成０
        calendar.set(Calendar.MONTH, 0);
        //把当前时间分钟变成０
        calendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 0);
        // 把当前时间秒数变成０
        calendar.set(Calendar.MILLISECOND, 0);
        // 把当前时间毫秒变成０
        return calendar.getTime();
    }


    // ////////////////////////////////////////////////////////////////////////////
    // formatShortTime
    // 将日期按照一定的格式转化为字符串
    // ////////////////////////////////////////////////////////////////////////////

    /**
     * 默认方式表示的系统当前日期，具体格式：时：分
     *
     * @return 默认日期按“时：分“格式显示
     */
    public static String formatShortTime() {
        return short_time_sdf.format(getCalendar().getTime());
    }

    /**
     * 指定毫秒数表示日期的默认显示，具体格式：时：分
     *
     * @param millis 指定的毫秒数
     * @return 指定毫秒数表示日期按“时：分“格式显示
     */
    public static String formatShortTime(long millis) {
        return short_time_sdf.format(new Date(millis));
    }

    /**
     * 指定日期的默认显示，具体格式：时：分
     *
     * @param cal 指定的日期
     * @return 指定日期按“时：分“格式显示
     */
    public static String formatShortTime(Calendar cal) {
        return short_time_sdf.format(cal.getTime());
    }

    /**
     * 指定日期的默认显示，具体格式：时：分
     *
     * @param date 指定的日期
     * @return 指定日期按“时：分“格式显示
     */
    public static String formatShortTime(Date date) {
        return short_time_sdf.format(date);
    }

    /**
     * 指定日期的默认显示，具体格式：月-日 时：分
     *
     * @param date 指定的日期
     * @return 指定日期按“月-日 时：分“格式显示
     */
    public static String formatMonthAndTime(Date date) {
        return date_sdf_mmddhhmm.format(date);
    }

    // ////////////////////////////////////////////////////////////////////////////
    // parseDate
    // parseCalendar
    // parseTimestamp
    // 将字符串按照一定的格式转化为日期或时间
    // ////////////////////////////////////////////////////////////////////////////

    /**
     * 根据指定的格式将字符串转换成Date 如输入：2003-11-19 11:20:20将按照这个转成时间
     *
     * @param src     将要转换的原始字符窜
     * @param pattern 转换的匹配格式
     * @return 如果转换成功则返回转换后的日期
     * @throws ParseException
     */
    public static Date parseDate(String src, String pattern) {
        try {
            return getSDFormat(pattern).parse(src);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据指定的格式将字符串转换成Date 如输入：2003-11-19 11:20:20将按照这个转成时间
     *
     * @param src     将要转换的原始字符窜
     * @param pattern 转换的匹配格式
     * @return 如果转换成功则返回转换后的日期
     * @throws ParseException
     */
    public static Date parseDate(String src, SimpleDateFormat pattern)
            throws ParseException {
        return pattern.parse(src);

    }

    /**
     * 根据指定的格式将字符串转换成Date 如输入：2003-11-19 11:20:20将按照这个转成时间
     *
     * @param src     将要转换的原始字符窜
     * @param pattern 转换的匹配格式
     * @return 如果转换成功则返回转换后的日期
     * @throws ParseException
     */
    public static Calendar parseCalendar(String src, String pattern)
            throws ParseException {

        Date date = parseDate(src, pattern);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

    public static String formatAddDate(String src, String pattern, int amount)
            throws ParseException {
        Calendar cal;
        cal = parseCalendar(src, pattern);
        cal.add(Calendar.DATE, amount);
        return formatDate(cal);
    }

    /**
     * 根据指定的格式将字符串转换成Date 如输入：2003-11-19 11:20:20将按照这个转成时间
     *
     * @param src     将要转换的原始字符窜
     * @param pattern 转换的匹配格式
     * @return 如果转换成功则返回转换后的时间戳
     * @throws ParseException
     */
    public static Timestamp parseTimestamp(String src, String pattern)
            throws ParseException {
        Date date = parseDate(src, pattern);
        return new Timestamp(date.getTime());
    }

    // ////////////////////////////////////////////////////////////////////////////
    // dateDiff
    // 计算两个日期之间的差值
    // ////////////////////////////////////////////////////////////////////////////

    /**
     * 计算两个时间之间的差值，根据标志的不同而不同
     *
     * @param flag   计算标志，表示按照年/月/日/时/分/秒等计算
     * @param calSrc 减数
     * @param calDes 被减数
     * @return 两个日期之间的差值
     */
    public static int dateDiff(char flag, Calendar calSrc, Calendar calDes) {

        long millisDiff = getMillis(calSrc) - getMillis(calDes);

        if (flag == 'y') {
            return (calSrc.get(calSrc.YEAR) - calDes.get(calDes.YEAR));
        }
        if (flag == 'M') {
            return (int) (millisDiff / (ONE_MONTH * SECOND_IN_MILLIS));
        }
        if (flag == 'd') {
            return (int) (millisDiff / DAY_IN_MILLIS);
        }

        if (flag == 'h') {
            return (int) (millisDiff / HOUR_IN_MILLIS);
        }

        if (flag == 'm') {
            return (int) (millisDiff / MINUTE_IN_MILLIS);
        }

        if (flag == 's') {
            return (int) (millisDiff / SECOND_IN_MILLIS);
        }

        return 0;
    }

    /**
     * 计算两个月份之前的差值
     *
     * @param startMonth 2018-01
     * @param endMonth   2019-05
     * @return
     */
    public static int monthDiff(String startMonth, String endMonth) {
        String[] startMonthArr = startMonth.split("-");
        String[] endMonthArr = endMonth.split("-");
        return 12 * (Integer.parseInt(endMonthArr[0]) - Integer.parseInt(startMonthArr[0])) + Integer.parseInt(endMonthArr[1]) - Integer.parseInt(startMonthArr[1]);
    }

    /**
     * String类型 转换为Date, 如果参数长度为10 转换格式”yyyy-MM-dd“ 如果参数长度为19 转换格式”yyyy-MM-dd
     * HH:mm:ss“ * @param text String类型的时间值
     */
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.hasText(text)) {
            try {
                if (text.indexOf(":") == -1 && text.length() == 10) {
                    setValue(date_sdf.parse(text));
                } else if (text.indexOf(":") > 0 && text.length() == 19) {
                    setValue(datetimeFormat.parse(text));
                } else {
                    throw new IllegalArgumentException(
                            "Could not parse date, date format is error ");
                }
            } catch (ParseException ex) {
                IllegalArgumentException iae = new IllegalArgumentException(
                        "Could not parse date: " + ex.getMessage());
                iae.initCause(ex);
                throw iae;
            }
        } else {
            setValue(null);
        }
    }

    public static int getYear() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(getDate());
        return calendar.get(Calendar.YEAR);
    }

    public static int getYear(Date date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    public static Date addMinute(Date date, int minute) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(GregorianCalendar.MINUTE, minute);// 加、减分钟
        return calendar.getTime();
    }

    public static Date addSecond(Date date, int second) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(GregorianCalendar.SECOND, second);// 加、减秒
        return calendar.getTime();
    }

    /**
     * 日期增加天数
     *
     * @param date
     * @param day
     * @return
     */
    public static Date addDay(Date date, int day) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(GregorianCalendar.DAY_OF_YEAR, day);// 加、减天数
        return calendar.getTime();
    }

    /**
     * 日期增加小时
     *
     * @param date
     * @param hour
     * @return
     */
    public static Date addHour(Date date, int hour) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(GregorianCalendar.HOUR, hour);// 加、减小时
        return calendar.getTime();
    }

    /**
     * 获取下单时间【返回秒数5位，不足补零】
     */
    public static String getSecond() {
        String[] my = DateUtils.formatDate("HH:mm:ss").split(":");
        int hour = Integer.parseInt(my[0]);
        int min = Integer.parseInt(my[1]);
        int sec = Integer.parseInt(my[2]);
        long totalSec = hour * 3600 + min * 60 + sec;
        DecimalFormat df = new DecimalFormat("00000");
        String str2 = df.format(totalSec);
        return str2;
    }

    /**
     * 距离现在的时间 用xx秒前 xx分前，当时间判断到xx小时之前时，直接返回yyyy-MM-dd HH:mm的时间
     *
     * @param date 时间
     * @return
     */
    public static String fromTodayConvert(Date date) {
        return fromTodayConvert(date, true);
    }

    /**
     * 距离现在的时间 用xx秒前 xx分前 xx天前
     *
     * @param date     时间
     * @param isSimple 是否简单表示，true-当时间判断到xx小时之后时，直接返回yyyy-MM-dd HH:mm的时间；false-一直转换到xx年
     * @return
     */
    public static String fromTodayConvert(Date date, boolean isSimple) {
        if (UtilValidate.isEmpty(date)) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        long time = date.getTime() / 1000;
        long now = System.currentTimeMillis() / 1000;
        long ago = now - time;
        if (ago <= ONE_HOUR) {
            return ago / ONE_MINUTE + "分钟前";
        } else if (ago <= ONE_DAY) {
            return ago / ONE_HOUR + "小时" + (isSimple ? "" : (ago % ONE_HOUR / ONE_MINUTE) + "分钟") + "前";
        } else {
            if (isSimple) {
                return formatTime(date);
            } else {
                if (ago <= ONE_DAY * 2) {
                    return "昨天" + calendar.get(Calendar.HOUR_OF_DAY) + "点" + calendar.get(Calendar.MINUTE) + "分";
                } else if (ago <= ONE_DAY * 3) {
                    return "前天" + calendar.get(Calendar.HOUR_OF_DAY) + "点" + calendar.get(Calendar.MINUTE) + "分";
                } else if (ago <= ONE_MONTH) {
                    long day = ago / ONE_DAY;
                    if (day < 7)
                        return day + "天前";
                    else if (day >= 7 && day < 14)
                        return "1周前";
                    else if (day >= 14 && day < 21)
                        return "2周前";
                    else if (day >= 21 && day < 28)
                        return "3周前";
                    else
                        return "4周前";
                } else if (ago <= ONE_YEAR) {
                    long month = ago / ONE_MONTH;
                    long day = ago % ONE_MONTH / ONE_DAY;
                    return month + "个月" + day + "天前";
                } else {
                    long year = ago / ONE_YEAR;
                    int month = calendar.get(Calendar.MONTH) + 1;// JANUARY which is 0 so month+1
                    return year + "年前" + month + "月" + calendar.get(Calendar.DATE)
                            + "日";
                }
            }
        }
    }


    /**
     * 获取日期所在星期
     * 星期是0-6
     *
     * @param date
     * @return
     */
    public static String getDayOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int week_index = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (week_index <= 0) {
            week_index = 7;
        }
        return String.valueOf(week_index);
    }

    /**
     * 添加addMonth个月份
     *
     * @param date     传入时间
     * @param addMonth 添加月份数
     * @return
     */
    public static Date addMonth(Date date, Integer addMonth) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, addMonth);
        return calendar.getTime();
    }

    /**
     * 添加addYear年份
     *
     * @param date    传入时间
     * @param addYear 添加年份数
     * @return
     */
    public static Date addYear(Date date, Integer addYear) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, addYear);
        return calendar.getTime();
    }

    /**
     * 拿到昨天凌晨 0时时间
     *
     * @return
     */
    public static String getYesterdayStart() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.DATE, -1);
        date = calendar.getTime();

        SimpleDateFormat format = getDateFormat("yyyy-MM-dd");

        StringBuffer time = new StringBuffer();

        String dateString = format.format(date);

        time.append(dateString).append(" ").append("00:00:00");

        return time.toString();

    }

    public static SimpleDateFormat getDateFormat(String parttern) throws RuntimeException {
        return new SimpleDateFormat(parttern);
    }

    /**
     * 处理时间显示
     * xx秒前，xx分钟前
     *
     * @param createTime
     * @return
     */
    public static String formatTimeLabel(Date createTime) {
        if (createTime == null) {
            return null;
        }
        Date now = new Date();
        long sub = now.getTime() - createTime.getTime();
        //一分钟以内
        if (sub < 60 * 1000) {
            return (sub / 1000) + "秒前";
        }
        //一小时以内
        if (sub < 1 * 60 * 60 * 1000) {
            return sub / (60 * 1000) + "分钟前";
        }
        //一个小时
        if (sub == 1 * 60 * 60 * 1000) {
            return "1小时前";
        }
        //当天
        String nowStr = DateUtils.formatDate(now);
        String createTimeStr = DateUtils.formatDate(createTime);
        if (nowStr.equals(createTimeStr)) {
            return DateUtils.formatShortTime(createTime);
        }
        //一年以内
        String nowYear = DateUtils.formatDate(now, "yyyy");
        String createTimeYear = DateUtils.formatDate(createTime, "yyyy");
        if (nowYear.equals(createTimeYear)) {
            return DateUtils.formatDate(createTime, "MM月dd日 HH:mm");
        }
        return DateUtils.formatDate(createTime, "yyyy年MM月dd日");
    }

    public static Date getDateTime(int second) {
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.SECOND, second);
        return date = c.getTime();

    }

    /**
     * 校验当前时间是否在diff天之内
     *
     * @param beginTime 开始时间
     * @param endTime   结束时间
     * @param diff      相差天数
     */
    public static boolean compareDiffDay(Date beginTime, Date endTime, Integer diff) {
        long beginTimestamp = beginTime.getTime();
        long endTimestamp = endTime.getTime();
        long diffTimestamp = diff * 24 * 60 * 60 * 1000;
        return (endTimestamp - beginTimestamp) <= diffTimestamp;
    }

    public static long getDateForLongTime(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (UtilValidate.isNotEmpty(date)) {
            calendar.setTime(date);
        }
        int hour = calendar.get(Calendar.HOUR_OF_DAY);//获取当前小时
        int min = calendar.get(Calendar.MINUTE);//获取当前小时
        long totalSec = hour * 3600 + min * 60;

        return totalSec;
    }

    public static long getDateForLongTime() {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);//获取当前小时
        int min = calendar.get(Calendar.MINUTE);//获取当前小时
        long totalSec = hour * 3600 + min * 60;

        return totalSec;
    }

    /**
     * 时间比较
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int compareDate(Date date1, Date date2) {
        if (date1.getTime() > date2.getTime()) {
            return 1;
        } else if (date1.getTime() < date2.getTime()) {
            return -1;
        } else {//相等
            return 0;
        }
    }

    /**
     * 计算两个日期之间的差值
     *
     * @param date1 日期1
     * @param date2 日期2
     * @return xx年xx月xx天xx小时
     */
    public static String compareDateDiff(Date date1, Date date2, boolean minuteFlag) {
        String result = "";
        if (date2.compareTo(date1) > 0) {
            Date date3 = null;
            date3 = date1;
            date1 = date2;
            date2 = date3;
        }
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(date1);
        c2.setTime(date2);
        int year = DateUtils.dateDiff('y', c1, c2);
        if (year > 0) {
            result = result.concat(year + "年");
            c1.setTimeInMillis(c1.getTimeInMillis() - year * DateUtils.ONE_YEAR * DateUtils.SECOND_IN_MILLIS);
        }
        int month = DateUtils.dateDiff('M', c1, c2);
        if (month > 0) {
            result = result.concat(month + "个月");
            c1.setTimeInMillis(c1.getTimeInMillis() - month * DateUtils.ONE_MONTH * DateUtils.SECOND_IN_MILLIS);
        }
        int day = DateUtils.dateDiff('d', c1, c2);
        if (day > 0) {
            result = result.concat(day + "天");
            c1.setTimeInMillis(c1.getTimeInMillis() - day * DateUtils.ONE_DAY * DateUtils.SECOND_IN_MILLIS);
        }
        int hour = DateUtils.dateDiff('h', c1, c2);
        if (hour > 0) {
            result = result.concat(hour + "小时");
            c1.setTimeInMillis(c1.getTimeInMillis() - hour * DateUtils.ONE_HOUR * DateUtils.SECOND_IN_MILLIS);
        }
        if (minuteFlag) {
            int minute = DateUtils.dateDiff('m', c1, c2);
            if (minute > 0) {
                result = result.concat(minute + "分");
            }
        }
        return result;
    }

    /**
     * 将秒数转换为日时分秒，
     *
     * @param second
     * @return
     */
    public static String secondToTime(long second) {
        long days = second / 86400;            //转换天数
        second = second % 86400;            //剩余秒数
        long hours = second / 3600;            //转换小时
        second = second % 3600;                //剩余秒数
        long minutes = second / 60;            //转换分钟
        second = second % 60;                //剩余秒数
        if (days > 0) {
            return days + "天" + hours + "小时" + minutes + "分" + second + "秒";
        } else {
            return hours + "小时" + minutes + "分" + second + "秒";
        }
    }

    public static void main(String[] args) {
        //test3();
    }

    private static void test3() {
        System.out.println(DateUtils.getDate().getTime());
        System.out.println(DateUtils.formatDate(DateUtils.getDate(), "HH:mm"));
        System.out.println(DateUtils.formatTime(setSecondMillisecondToZero(DateUtils.getDate())));
    }

    private static void test2() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR, 4);
        System.out.println(getDateForLongTime(calendar.getTime()));
        System.out.println(getDateForLongTime());
    }

    private static void test1() {
        System.out.println(getDayOfWeek(getDate()));
        System.out.println(getDayOfWeek(addDay(getDate(), 1)));
        System.out.println(getDayOfWeek(addDay(getDate(), 2)));
        System.out.println(getDayOfWeek(addDay(getDate(), 3)));
        System.out.println(getDayOfWeek(addDay(getDate(), 4)));
        System.out.println(getDayOfWeek(addDay(getDate(), 5)));
        System.out.println(getDayOfWeek(addDay(getDate(), 6)));

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 0);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DATE, 0);
        calendar.add(Calendar.HOUR, 4);
        //calendar.set(Calendar.HOUR, 0);
        //calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);//获取当前小时
        int min = calendar.get(Calendar.MINUTE);//获取当前小时
        long totalSec = hour * 3600 + min * 60;
        System.out.println(hour);
        System.out.println(min);
        System.out.println(totalSec);
    }

    /**
     * 获取两个时间相差的年份
     *
     * @param from
     * @param to
     * @return
     */
    public static int getDateLength(Date from, Date to) {
        Calendar startCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();
        startCalendar.setTime(from);
        endCalendar.setTime(to);
        int startYear = startCalendar.get(Calendar.YEAR);
        int endYear = endCalendar.get(Calendar.YEAR);
        return ((endYear - startYear) < 0 ? 0 : endYear - startYear);
    }

    /**
     * 比较二个日期之间相差多少分钟
     *
     * @param d1 日期较大的
     * @param d2 日期较小的
     * @return
     */
    public static double compareDateForMinute(Date d1, Date d2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        return dateDiff('m', c1, c2);
    }

    /**
     * 比较二个日期之间相差多少小时
     *
     * @param d1 日期较大的
     * @param d2 日期较小的
     * @return
     */
    public static int compareDateForHour(Date d1, Date d2) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(d1);
        c2.setTime(d2);
        return dateDiff('h', c1, c2);
    }

    /**
     * 获取"yyyy-MM-dd 00:00:00"格式日期
     * @return
     */
    public static Date getStartTimeOfDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 0, 0, 0);
        return calendar.getTime();
    }

    /**
     * 获取"yyyy-MM-dd 00:00:00"格式日期
     * @param date
     * @return
     */
    public static Date getStartTimeOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 0, 0, 0);
        return calendar.getTime();
    }

    /**
     * 获取"yyyy-MM-dd 23:59:59"格式日期
     * @return
     */
    public static Date getEndTimeOfDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 23, 59, 59);
        return calendar.getTime();
    }

    /**
     * 获取"yyyy-MM-dd 23:59:59"格式日期
     * @param date
     * @return
     */
    public static Date getEndTimeOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 23, 59, 59);
        return calendar.getTime();
    }
}

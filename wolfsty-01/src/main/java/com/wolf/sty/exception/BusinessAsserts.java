package com.wolf.sty.exception;


import com.wolf.sty.util.UtilValidate;

/**
 * 业务断言,当不满足条件时,抛出封装了具体ExceptionType的BusinessException
 *
 * @author Nian.Li
 * @version v1.0
 * @date 2017年2月24日
 */
public class BusinessAsserts {

    private BusinessAsserts() {
    }

    public static void isFalse(boolean expression, ExceptionType throwing) {
        isTrue(!expression, throwing, "");
    }

    public static void isTrue(boolean expression, ExceptionType throwing) {
        isTrue(expression, throwing, "");
    }

    /**
     * @param expression
     * @param throwing
     * @param msg        异常消息模板,使用String.format
     * @param args       异常消息填充参数
     */
    public static void isTrue(boolean expression, ExceptionType throwing, String msg, Object... args) {
        if (!expression) {
            try {
                msg = String.format(msg, args);
            } catch (Exception e) {
                e.printStackTrace();
            }
            throw new BusinessException(throwing, msg);
        }
    }

    public static void notNull(Object object, ExceptionType throwing) {
        notNull(object, throwing, "");
    }

    public static void notNull(Object object, ExceptionType throwing, String msg, Object... args) {
        if (UtilValidate.isEmpty(object)) {
            throw new BusinessException(throwing, String.format(msg, args));
        }
    }

    public static void isNull(Object object, ExceptionType throwing) {
        isNull(object, throwing, "");
    }

    public static void isNull(Object object, ExceptionType throwing, String msg, Object... args) {
        if (UtilValidate.isNotEmpty(object)) {
            throw new BusinessException(throwing, String.format(msg, args));
        }
    }

    public static void notBlank(String string, ExceptionType throwing) {
        notBlank(string, throwing, "");
    }

    public static void notBlank(String string, ExceptionType throwing, String msg, Object... args) {
        if (UtilValidate.isEmpty(string)) {
            throw new BusinessException(throwing, String.format(msg, args));
        }
    }

    public static void isBlank(String string, ExceptionType throwing) {
        isBlank(string, throwing, "");
    }

    public static void isBlank(String string, ExceptionType throwing, String msg, Object... args) {
        if (UtilValidate.isEmpty(string)) {
            throw new BusinessException(throwing, String.format(msg, args));
        }
    }

    public static void notEqual(Object object1, Object object2, ExceptionType throwing) {
        notEqual(object1, object2, throwing, "");
    }

    public static void notEqual(Object object1, Object object2, ExceptionType throwing, String msg, Object... args) {
        if (object1 == object2) {
            throw new BusinessException(throwing, String.format(msg, args));
        }
    }

}

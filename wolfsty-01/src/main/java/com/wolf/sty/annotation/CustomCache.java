package com.wolf.sty.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by user on 2020/9/24.
 */
@Target({java.lang.annotation.ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomCache {
    String key();

    String pre();//前缀

    boolean refresh() default false;//是否清除缓存
}

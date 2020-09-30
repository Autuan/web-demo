package com.autuan.webdemo.project.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* 我的注解 用于展示
* @author Autuan.Yu
* @date 2020/9/30
*/
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String msg() default "";

    String title() default "";
}

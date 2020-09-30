package com.autuan.webdemo.project.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @description: MyAnnotationAspect
 * @author: Autuan.Yu
 * @create: 2020/09/30 16:34
 * @copyright: Toplist
 */
@Aspect
@Component
public class MyAnnotationAspect {
    /**
    * 切入点配置
    * @author Autuan.Yu
    * @date 2020/9/30
    */
    @Pointcut("@annotation(com.autuan.webdemo.project.aop.MyAnnotation)")
    public void aspectLocation(){

    }
    /**
    * 做我们想在切面中做的事
    * @param
    * @return
    * @author Autuan.Yu
    * @date 2020/9/30
    */
    @Around("aspectLocation()")
    public void doMyWant(ProceedingJoinPoint pjp){
        Signature signature = pjp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
        String msg = annotation.msg();
        String title = annotation.title();

        System.out.println("自定义注解执行---》");
        System.out.println("自定义注解 ---》 msg ---> " + msg);
        System.out.println("自定义注解 ---》 title ---> " + title);
    }
}

package com.autuan.webdemo.project.aop;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.autuan.webdemo.project.ennum.BusinessType;
import com.autuan.webdemo.util.ServletUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 操作日志记录处理
 *
 * @author ruoyi
 */
@Aspect
@Component
public class LogAspect {
    private static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 配置织入点
     */
    @Pointcut("@annotation(com.autuan.webdemo.project.aop.Log)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        Object result = pjp.proceed();
        try {
            RequestAttributes ra = RequestContextHolder.getRequestAttributes();
            ServletRequestAttributes sra = (ServletRequestAttributes) ra;
            HttpServletRequest request = sra.getRequest();

            Signature signature = pjp.getSignature();
            MethodSignature methodSignature = (MethodSignature) signature;
            Method method = methodSignature.getMethod();
            Log logAnoo = method.getAnnotation(Log.class);
            String title = logAnoo.title();

            String url = request.getRequestURL().toString();
            String httpMethod = request.getMethod();
            String uri = request.getRequestURI();
            String queryString = request.getQueryString();
            //重点 这里就是获取@RequestBody参数的关键  调试的情况下 可以看到o变量已经获取到了请求的参数
            Object[] requestBodyObjArray = pjp.getArgs();
            String queryBody = JSONUtil.toJsonStr(requestBodyObjArray);
            String targetStr = pjp.getSignature().toString();
            String responseStr = JSONUtil.toJsonStr(result);
            System.out.println("请求--- >url");
            System.out.println(url);
            System.out.println("请求---> req method ");
            System.out.println(httpMethod);
            System.out.println("请求---> title ");
            System.out.println(title);
            System.out.println("请求---> uri ");
            System.out.println(uri);
            System.out.println("请求---> queryString ");
            System.out.println(queryString);
            System.out.println("请求---> queryBody ");
            System.out.println(queryBody);
            System.out.println("请求---> responseStr ");
            System.out.println(responseStr);
            System.out.println("请求---> targetStr ");
            System.out.println(targetStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}

package com.len.blog.aspect;

import com.len.blog.annotation.log.RequsetLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * 接口请求时打印请求日志切面
 *
 * @author liyong
 * @version 1.0
 * @className LogAspect
 * @description LogAspect
 * @date 2020/9/18 16:21
 */
@Component
@Aspect
public class LogAspect {
    private Logger logger = Logger.getLogger(LogAspect.class.getName());

    @Around("@annotation(com.len.blog.annotation.log.RequsetLog)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();
        RequsetLog annotation = method.getAnnotation(RequsetLog.class);
        // 记录下请求内容
        logger.info("======================description ：" + annotation.description() + "===================================");
        logger.info("URL : " + request.getRequestURL().toString());
        logger.info("HTTP_METHOD : " + request.getMethod());
        logger.info("IP : " + request.getRemoteAddr());
        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
        logger.info("=======================================================================================");
        return joinPoint.proceed();
    }


}

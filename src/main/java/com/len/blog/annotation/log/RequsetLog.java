package com.len.blog.annotation.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 接口请求时打印请求日志注解
 * @ClassName annotation
 * @Description annotation
 * @Author liyong
 * @Date 2020/9/18 16:13
 * @Version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequsetLog {

    String description() default "";

}

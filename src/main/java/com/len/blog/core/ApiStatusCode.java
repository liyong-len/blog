package com.len.blog.core;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liyong
 * @version 1.0
 * @className ApiStatusCode
 * @description ApiStatusCode
 * @date 2020/9/18 16:41
 */
@AllArgsConstructor
public enum ApiStatusCode {
    /**
     * 请求成功
     */
    OK("成功", 200),
    /**
     * 请求失败
     */
    FAIL("失败", 500),
    /**
     * 校验失败
     */
    CHECK_FAIL("校验失败", 201);

    private String name;
    private int code;

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }
}

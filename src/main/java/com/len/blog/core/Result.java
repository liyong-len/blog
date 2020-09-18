package com.len.blog.core;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author liyong
 * @version 1.0
 * @className Result
 * @description Result
 * @date 2020/9/18 16:40
 */
@Data
@AllArgsConstructor
public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result ok(Object data) {
        return new Result(ApiStatusCode.OK.getCode(), "Success", data);
    }

    public static Result fail(Object data) {
        return new Result(ApiStatusCode.FAIL.getCode(), "Fail", data);
    }

    public static Result checkFail(Object data) {
        return new Result(ApiStatusCode.CHECK_FAIL.getCode(), "Check fail", data);
    }
}

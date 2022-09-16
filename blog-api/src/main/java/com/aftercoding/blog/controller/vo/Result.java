package com.aftercoding.blog.controller.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-09-15 15:03
 */
@Data
@AllArgsConstructor//全部生成构造函数
public class Result {
    private boolean success;
    private int code;
    private String msg;
    private Object data;

    public static Result success(Object data){
        return new Result(true, 200, "success", data);
    }
    public static Result fail(int code, String msg){
        return new Result(false, 200, msg, null);
    }
}

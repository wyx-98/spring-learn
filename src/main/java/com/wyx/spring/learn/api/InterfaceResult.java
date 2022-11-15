package com.wyx.spring.learn.api;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wyx9852@gmail.com
 * @version 1.0
 * @description 通用返回对象
 * @date 2020/9/22 上午10:46
 */
@Data
@NoArgsConstructor
public class InterfaceResult<T> implements Serializable {
    private String code;
    private String msg;
    private T data;
    private Boolean flag;

    public InterfaceResult(String code, String msg, Boolean flag) {
        this.code = code;
        this.msg = msg;
        this.flag = flag;
    }

    public InterfaceResult(String code, String msg, T data, Boolean flag) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.flag = flag;
    }


    public static InterfaceResult<Object> failed() {
        return new InterfaceResult<>(ResultCode.FAILED.getCode(), ResultCode.FAILED.getMsg(), ResultCode.FAILED.getFlag());
    }

    public static InterfaceResult<Object> failed(ResultCode resultCode) {
        return new InterfaceResult<>(resultCode.getCode(), resultCode.getMsg(), resultCode.getFlag());
    }

    public static <T> InterfaceResult<T> success(T data) {
        return new InterfaceResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data, ResultCode.SUCCESS.getFlag());
    }
}

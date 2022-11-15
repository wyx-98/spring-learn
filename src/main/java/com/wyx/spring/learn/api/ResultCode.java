package com.wyx.spring.learn.api;

/**
 * @program: spring-learn
 * @description: 状态码枚举
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-07-15 11:46
 **/
public enum ResultCode {

    SUCCESS("000000", "操作成功", true),
    FAILED("B00001", "操作失败", true),
    BODY_NOT_MATCH("B0002", "请求参数不匹配", true);
    /**
     * 错误码
     */
    private final String code;
    /**
     * msg信息
     */
    private final String msg;
    /**
     * 前端是否展示
     */
    private final Boolean flag;

    ResultCode(String code, String msg, Boolean flag) {
        this.code = code;
        this.msg = msg;
        this.flag = flag;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Boolean getFlag() {
        return flag;
    }
}

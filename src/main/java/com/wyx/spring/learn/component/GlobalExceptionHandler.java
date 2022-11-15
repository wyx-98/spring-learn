package com.wyx.spring.learn.component;

import com.wyx.spring.learn.api.InterfaceResult;
import com.wyx.spring.learn.api.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: spring-learn
 * @description: 全局异常处理器
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-07-15 11:41
 **/
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @Order
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public InterfaceResult<Object> handleException(Exception e) {
        log.error("未知异常！原因是:", e);
        return InterfaceResult.failed();
    }

    /**
     * 处理空指针的异常
     * @param e exception
     * @return 返回的结果
     */
    @ExceptionHandler(value =NullPointerException.class)
    @ResponseBody
    public InterfaceResult<Object> exceptionHandler(NullPointerException e){
        log.error("发生空指针异常！原因是:",e);
        return InterfaceResult.failed(ResultCode.BODY_NOT_MATCH);
    }
}

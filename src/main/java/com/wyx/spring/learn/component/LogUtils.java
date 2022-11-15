package com.wyx.spring.learn.component;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: springCloudLearn
 * @description:
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-06-19 18:03
 **/
@Component
@Aspect
public class LogUtils {

    @Pointcut("execution(* com.wyx.spring.learn.service.impl.MyRentHouseServiceImpl.*(..))")
    public void pt1() {

    }

    @Before("pt1()")
    public void before() {

    }

    @After("pt1()")
    public void after() {

    }

}

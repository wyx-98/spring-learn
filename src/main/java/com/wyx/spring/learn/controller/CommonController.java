package com.wyx.spring.learn.controller;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-learn
 * @description: 公共Controller
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-07-26 22:19
 **/
@RestController
@RequestMapping("/snowflakeId")
public class CommonController {

    @GetMapping
    public Long getSnowflakeId() {
        long workerId = 1L;
        long datacenterId = 2L;
        Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);
        return snowflake.nextId();
    }
}

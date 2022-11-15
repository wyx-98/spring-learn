package com.wyx.spring.learn.controller;

import com.wyx.spring.learn.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @program: spring-learn
 * @description: 供jmeter测试
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-07-27 11:47
 **/
@RequestMapping("/api/v1/user")
@RestController
public class UserController {

    @PostMapping
    public String create(@RequestBody User user) throws InterruptedException {
        //线程挂起3秒，方便jmeter测试
        Thread.sleep(3000);
        return "创建成功";
    }

    @GetMapping
    public String get() throws InterruptedException {
        //线程挂起3秒，方便jmeter测试
        Thread.sleep(300);
        return "查询成功";
    }
}

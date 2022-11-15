package com.wyx.spring.learn.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: spring-learn
 * @description:
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-07-13 21:45
 **/
//@Configuration
@MapperScan("com.wyx.spring.learn.mapper")
public class MybatisConfig {
}

package com.wyx.spring.learn;

import cn.hippo4j.core.enable.EnableDynamicThreadPool;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.wyx.spring.learn.config.DruidDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @program: springLearnApplication
 * @description:
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-06-03 23:50
 **/
//@EnableDynamicThreadPool
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class})
public class SpringLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }
}

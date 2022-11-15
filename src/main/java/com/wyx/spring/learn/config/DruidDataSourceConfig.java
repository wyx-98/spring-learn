package com.wyx.spring.learn.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.sql.DataSource;

/**
 * @program: git-test
 * @description: 动态数据源手动配置
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-06-23 01:29
 **/
//@Configuration
public class DruidDataSourceConfig {

    @Value("${spring.datasource.druid.connection-properties}")
    private String connectionProperties;

    @Value("spring.datasource.druid.password")
    private String password;

    @ConfigurationProperties("spring.datasource.druid")
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setPassword(password);
        druidDataSource.setConnectionProperties(connectionProperties);
        return druidDataSource;
    }
}

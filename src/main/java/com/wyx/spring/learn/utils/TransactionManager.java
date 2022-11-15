package com.wyx.spring.learn.utils;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

/**
 * @program: springCloudLearn
 * @description: 事务管理器
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-06-18 17:33
 **/
public class TransactionManager {

    @Autowired
    public ConnectionUtil connectionUtils;

    // 开启手动事务控制
    public void beginTransaction() throws SQLException {
        connectionUtils.getCurrentConnection().setAutoCommit(false);
    }


    // 提交事务
    public void commit() throws SQLException {
        connectionUtils.getCurrentConnection().commit();
    }


    // 回滚事务
    public void rollback() throws SQLException {
        connectionUtils.getCurrentConnection().rollback();
    }
}

package com.wyx.spring.learn.utils;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program: springCloudLearn
 * @description: 数据库连接工具类
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-06-18 17:19
 **/
public class ConnectionUtil {

    private ConnectionUtil() {

    }

    private static ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<>();

    public Connection getCurrentConnection() {
        Connection connection = connectionThreadLocal.get();
        if (connection == null) {
            //从数据库连接池中拿到连接
            //把当前连接放到threadLocal中
//            connectionThreadLocal.set(DruidUtil.getInstance().getConnection());
        }
        return connection;
    }
}

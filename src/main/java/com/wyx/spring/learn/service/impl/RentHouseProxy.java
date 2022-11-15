package com.wyx.spring.learn.service.impl;

import com.wyx.spring.learn.service.IRentHouseService;

import java.sql.SQLException;

/**
 * @program: springCloudLearn
 * @description: 租房子代理类(静态代理)
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-06-18 15:46
 **/
public class RentHouseProxy implements IRentHouseService {

    private final IRentHouseService rentHouseService;

    public RentHouseProxy(IRentHouseService iRentHouseService) {
        this.rentHouseService = iRentHouseService;
    }

    @Override
    public void rentHouse() throws SQLException {
        System.out.println("收取中介费");
        rentHouseService.rentHouse();
        System.out.println("将客户信息卖了3毛");
    }
}

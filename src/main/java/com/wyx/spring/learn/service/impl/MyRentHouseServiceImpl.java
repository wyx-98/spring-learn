package com.wyx.spring.learn.service.impl;

import com.wyx.spring.learn.service.IRentHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import com.wyx.spring.learn.dao.RentHouseDao;

import java.sql.SQLException;

/**
 * @program: springCloudLearn
 * @description:
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-06-18 15:45
 **/
public class MyRentHouseServiceImpl implements IRentHouseService {

    @Autowired
    public RentHouseDao rentHouseDao;

    @Override
    public void rentHouse() throws SQLException {
        rentHouseDao.transfer();
        System.out.println("我要租房子");
    }
}

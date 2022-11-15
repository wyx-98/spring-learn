package com.wyx.spring.learn.dao.impl;

import com.wyx.spring.learn.utils.ConnectionUtil;
import com.wyx.spring.learn.utils.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import com.wyx.spring.learn.dao.RentHouseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @program: springCloudLearn
 * @description:
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-06-18 17:30
 **/
public class RentHouseDaoImpl implements RentHouseDao {

    @Autowired
    private ConnectionUtil connectionUtil;

    @Autowired
    private TransactionManager transactionManager;

    @Override
    public void transfer() throws SQLException {
        try {
            transactionManager.beginTransaction();
            Connection con = connectionUtil.getCurrentConnection();
            String sql = "select * from account where cardNo=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            transactionManager.commit();
        } catch (Exception e) {
            transactionManager.rollback();
        }
    }
}

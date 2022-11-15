package com.wyx.spring.learn;

import com.wyx.spring.learn.mapper.UserMapper;
import com.wyx.spring.learn.model.SysUser;
import com.wyx.spring.learn.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: git-test
 * @description: 测试数据源
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-06-22 16:09
 **/
@SpringBootTest
public class SpringBootDataSourceTest {

    @Autowired
    public DataSource dataSource;

    @Resource
    private UserMapper userMapper;



    @Test
    public void testDataSource() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(dataSource.getClass());
    }

    @Test
    public void testJedis() {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        Map<String, List<String>> roleResourceRelation = new HashMap<>();
        roleResourceRelation.put("vprivacy-admin", Stream.of("admin", "admin1", "admin2").collect(Collectors.toList()));
        roleResourceRelation.put("vprivacy-auth", Stream.of("auth", "auth1", "auth2").collect(Collectors.toList()));
        System.out.println(jedis.hget("auth:resource", "vprivacy-admin"));
    }

    @Test
    public void saveSysUser() {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("aa");
        sysUser.setPassword("xxxx");
        sysUser.setCompany("xxx");
        sysUser.setCreateTime(new Date());
        sysUser.setEnabled(true);
        sysUser.setHeadImgUrl("xxx");
        sysUser.setMobile("fsa");
        sysUser.setNickname("xxx");
        sysUser.setIsDel(false);
        sysUser.setSalary(12L);
        sysUser.setSex(true);
        sysUser.setType("123");
        sysUser.setOpenId("sdf");
        System.out.println(sysUser.getId());
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setName("xxx");
        user.setAge(13);
//        userService.save(user);
    }

    public static void main(String[] args) {
        String path = new File("").getAbsolutePath();
        String path2 = new File("").getPath();
        System.out.println("path:" + path);
        System.out.println("path2:" + path2);
    }

}

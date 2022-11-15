package com.wyx.spring.learn.repository;

import com.wyx.spring.learn.model.SysUser;
import com.wyx.spring.learn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: spring-learn
 * @description: sysUser
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-07-27 14:15
 **/
//@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

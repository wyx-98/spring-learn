package com.wyx.spring.learn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wyx.spring.learn.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author nieqiuqiu 2019/11/30
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

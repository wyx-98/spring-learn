package com.wyx.spring.learn.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.wyx.spring.learn.model.SysUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: spring-learn
 * @description: SysUserVO对象
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-07-13 22:32
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel("SysUserVO对象")
public class SysUserVO extends SysUser {

    @ApiModelProperty(value = "用户工资")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long salary;
}

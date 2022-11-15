package com.wyx.spring.learn.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysUser implements Serializable {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private String username;

    @ApiModelProperty(value = "登录密码")
    private String password;

    private String nickname;

    private String headImgUrl;

    private String mobile;

    private Boolean sex;

    private Boolean enabled;

    private String type;

    private Date createTime;

    private Date updateTime;

    private String company;

    private String openId;

    private Boolean isDel;

    @ApiModelProperty(value = "工资")
    private Long salary;

    private static final long serialVersionUID = 1L;
}
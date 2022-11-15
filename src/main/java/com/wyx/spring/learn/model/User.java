package com.wyx.spring.learn.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author nieqiuqiu 2019/11/30
 */
@Entity
@Data
public class User {
    @Id
//    @TableId(type = IdType.ASSIGN_ID)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

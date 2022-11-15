package com.wyx.spring.learn.pojo;

/**
 * @program: springCloudLearn
 * @description:
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-06-21 11:44
 **/
public class UmsAdminVO {
    private Long id;
    private Integer status;

    public Long getId() {
        System.out.println("get方法被调用。。。。。。。。。。。。。。。。。。。。。。");
        return id;
    }

    public Integer getStatus() {
        System.out.println("get方法被调用。。。。。。。。。。。。。。。。。。。。。。");
        return status;
    }

//    public void setId(Long id) {
//        System.out.println("set方法被调用。。。。。。。。。。。。。。。。。。。。。。");
//        this.id = id;
//    }
//
//    public void setStatus(Integer status) {
//        System.out.println("set方法被调用。。。。。。。。。。。。。。。。。。。。。。");
//        this.status = status;
//    }
}

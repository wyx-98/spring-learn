package org.wyx.controller;

import cn.hutool.core.date.DateBetween;
import cn.hutool.core.date.DateUtil;
import com.sun.tools.javac.util.List;

import java.util.stream.Collectors;

/**
 * @program: git-test
 * @description: 测试controller
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-05-02 22:28
 **/
public class TestController {
    public static void main(String[] args) {
        List<String> list = List.of("www.baidu.com", "www.fasdfasdfsd.com", "ffdas.com");
        java.util.List<String> com = list.stream()
                .filter(string -> string.contains("com"))
                .filter(string -> string.length() > 10)
                .collect(Collectors.toList());

    }
}

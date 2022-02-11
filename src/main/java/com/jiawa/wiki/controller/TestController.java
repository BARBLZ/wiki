package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //返回字符串
//@Controller  返回页面，前后端分离基本用不到
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;


    //常见的http请求方式有四种：GET,POST,PUT,DELETE
//    @RequestMapping("/hello")  //写一个接口，表示支持以上四种访问方式
    @GetMapping("/hello")  //只支持GET请求
    public String hello(){
        return "Hello World!" + testHello;
    }


    @PostMapping("/hello/post")  //只支持GET请求
    public String helloPost(String name){
        return "Hello World! Post," + name;
    }
}

package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //返回字符串
//@Controller  返回页面，前后端分离基本用不到
public class TestController {

    //常见的http请求方式有四种：GET,POST,PUT,DELETE
    @RequestMapping("/hello")  //写一个接口，表示支持以上四种访问方式
    public String hello(){
        return "Hello World!";
    }
}

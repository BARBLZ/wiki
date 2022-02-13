package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController  //返回字符串
@RequestMapping("/ebook")
//@Controller  返回页面，前后端分离基本用不到
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")  //只支持GET请求
    public List<Ebook> list(){
        return ebookService.list();
    }
}

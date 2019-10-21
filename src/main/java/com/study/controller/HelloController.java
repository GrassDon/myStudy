package com.study.controller;

import com.alibaba.fastjson.JSONObject;
import com.study.annotation.myfirstAnnotation;
import com.study.model.Books;
import com.study.service.myService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController    //代替responsebody和controller注解,返回json数据
public class HelloController {

    @Autowired
    myService myService;

    public static Logger logger = LoggerFactory.getLogger("springbootdemo");
    @GetMapping("/hello")    //等同于mapping(method="get")
    public String hello() {
        return "你好 hello spring boot!!!";
    }

    //springboot返回json数据。
    @GetMapping("/books")
    public Books books()
    {
        logger.info("进入books的controller");
        Books book = new Books("dong","1234");
        System.out.println("controller回显");
        System.out.println(book.toString());
        return book;
    }
    @GetMapping("/getuser")
    @myfirstAnnotation
    public String getUser(Integer id){
        return myService.getUser(id);
    }

    @GetMapping("/jsonbook")
    @myfirstAnnotation
    public JSONObject jsonbook()
    {
        logger.info("进入jsonbook方法。。。");
        Books books = new Books("lin","1235");
        return JSONObject.parseObject(books.toString());
    }
}

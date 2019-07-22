package com.study.controller;

import com.study.model.Books;
import com.study.service.myService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController    //代替responsebody和controller注解
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
        Books book = new Books();
        book.setAuth("dong");
        book.setName("124");
        System.out.println("controller回显");
        return book;
    }
    @GetMapping("getuser")
    public String getUser(Integer id){
        return myService.getUser(id);
    }
}

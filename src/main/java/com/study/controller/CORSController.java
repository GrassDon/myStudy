package com.study.controller;

import org.springframework.web.bind.annotation.*;

//跨域请求CORS（目前无效）
@RestController
@RequestMapping("/book")
public class CORSController {
    @PostMapping("/")
    @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")
    public String addBook(String name){
        System.out.println("test");
        return "receive:"+name;
    }
    @DeleteMapping("/{id}")
    @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,allowedHeaders = "*")
    public String deleteBookById(@PathVariable Long id)
    {
        System.out.println("test2");
        return String.valueOf(id);
    }
}

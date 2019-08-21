package com.study.controller;

import com.study.model.Books;
import com.study.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/*
* 处理与book相关的控制层类
* */
@RestController
public class bookController {
    @Autowired
    bookService bookService;

    //查询所有books
    @GetMapping("/allBook")
    public List<Books> getAllBookController(@RequestBody Books books)
    {
        System.out.println("......");
        return bookService.selectAll();
    }
}

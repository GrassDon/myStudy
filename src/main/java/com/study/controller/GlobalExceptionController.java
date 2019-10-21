package com.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/9/29 14:22
 */
@RestController
@RequestMapping("/exception")
public class GlobalExceptionController {
    @GetMapping("/get")
    public void get(){
        Integer a = null;
        System.out.println(3/0);
    }
}

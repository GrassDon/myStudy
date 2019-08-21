package com.study.controller;

import com.study.model.Books;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.Date;

/**
 * <p>
 * 说明：不同参数的controller方法前端显示问题
 * <li></li>
 * </p>
 *
 * @author Don
 * @date 2019/8/9 10:01
 */
@Controller
@RequestMapping("/test")
public class annotationsController {

    //@requestbody自定义的对象
    @RequestMapping("/testRb")
    @ResponseBody
    public Books testRb(@RequestBody Books e) {
        return e;
    }

    //自定义实体对象
    @RequestMapping("/testCustomObj")
    @ResponseBody
    public Books testCustomObj(Books e) {
        return e;
    }

    //带有@requestparam的对象
    @RequestMapping("/testCustomObjWithRp")
    @ResponseBody
    public Books testCustomObjWithRp(@RequestParam Books e) {
        return e;
    }

    //日期对象
    @RequestMapping("/testDate")
    @ResponseBody
    public Date testDate(Date date) {
        return date;
    }
}

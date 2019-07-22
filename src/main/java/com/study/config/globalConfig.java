package com.study.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

//此注解主要用来全局数据处理
@ControllerAdvice
public class globalConfig {
    //info即为key，方法的返回值是value，并将此键值对作为
    //全局数据，所有实现requestmapping注解，都可以调用这个全局数据。
    //当然，也可以不调用。
    @ModelAttribute(value="info")
    public Map<String,String> auth(){
        HashMap<String,String> map = new HashMap<>();
        map.put("authname","luo");
        map.put("gender","男");
        return map;
    }
}

package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Controller
public class globalConfigTest {
    @ResponseBody
    //getmapping注解等于requestmapping(method="get")
    @GetMapping("/global")
    public void write(Model model){
        Map<String,Object> map = model.asMap();
        System.out.println(model);
        Set<String> keyset = map.keySet();
        Iterator<String> iterator = keyset.iterator();
        System.out.println("test");
        while (iterator.hasNext()){
            String key = iterator.next();
            Object value = map.get(key);
            System.out.println(key+"        "+value);
        }
    }
}

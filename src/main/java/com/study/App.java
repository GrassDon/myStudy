package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

/*
这段注解可以直接用下面的代替
@EnableAutoConfiguration
@ComponentScan
*/
@SpringBootApplication
@ServletComponentScan
@EnableCaching
//@ComponentScan注解的作用就是扫描指定的包，讲所有bean加载到spring容器中。
@ComponentScan("com.study")
public class App{
    public static void main (String[] args){
        SpringApplication.run(App.class,args);
    }
}

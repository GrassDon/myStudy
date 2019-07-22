package com.study.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.Arrays;

/*
*系统启动时执行任务，例如配置文件加载，数据库初始化
* */

@Component
@Order(2) //定义加载顺序的注解
public class myCommandLineRunner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("系统启动时执行任务2："+ Arrays.toString(args));
    }
}
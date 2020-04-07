package com.study.Beans;

import com.study.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Personbean的配置类
 */

@Configuration
@ComponentScan(basePackages = "com.study.Beans")
public class PersonConfig {
    @Bean(initMethod = "initPerson")
    public Person person(){
        Person person = new Person();
        person.setName("shen");
        person.setSex("female");
        return person;
    }
}

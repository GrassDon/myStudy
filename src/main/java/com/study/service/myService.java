package com.study.service;

import org.springframework.stereotype.Service;

@Service
public class myService {
    public String getUser(int id){
        if(id==1){
            return "dong";
        }
        return "user";
    }
    public void deleteUser(int id){
        System.out.println("deleteuser");
    }
}

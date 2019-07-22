package com.study.service;

import org.springframework.stereotype.Service;

@Service
public class myService {
    public String getUser(int id){
        System.out.println("setuser");
        return "user";
    }
    public void deleteUser(int id){
        System.out.println("deleteuser");
    }
}

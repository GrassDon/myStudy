package com.test.instanceofTest;

public class test {
    public static void main(String[] args){
        ball football = new ball();
        football.setName("football");
        football.setNum(10);
        if(football instanceof ball)
        {
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}

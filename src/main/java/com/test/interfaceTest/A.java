package com.test.interfaceTest;

public class A implements myInterface {
    String name = myInterface.name;
    @Override
    public String sayName() {
        return name;
    }
}

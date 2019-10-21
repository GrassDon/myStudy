package com.study.model;


import javax.validation.constraints.NotBlank;

public class Human {

    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

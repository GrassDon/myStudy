package com.study.model;

import java.util.HashMap;
import java.util.Map;

public class Books {
    private String name;
    private String auth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Books(String name, String auth) {
        this.name = name;
        this.auth = auth;
    }

    @Override
    public String toString() {
        return "{" + "'name'" + ":'"+name + '\'' +
                ", 'auth'" +":'" + auth + '\'' +
                "}";
    }
}

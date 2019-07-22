package com.study.model;

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

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", auth='" + auth + '\'' +
                '}';
    }

}

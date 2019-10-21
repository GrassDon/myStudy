package com.study.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/*
entity注解表明这是一个实体类，在项目启动的时候，会
根据该类自动生成一张表，名称默认是类名，设置name值
之后，表明是neme值
*/
@Entity(name="flowers")
public class flowers {
    //id表示该属性是一个主键；generatedValue表示主键自动生成，strategy表示主键生成策略
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //默认情况下，表中的字段名就是实体类中的属性名，name表示表中的字段名，nullable则表示不为空
    @Column(name = "flower_name",nullable = false)
    private String name;
    private Integer num;
    //该注解可以自动校验前台传来的某些字段，不可以为空，如果空，则报错
    @NotBlank
    private String owner;
    private Float price;
    //transient注解表示该属性被忽略，在表中不生成对应字段
    @Transient
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.eleven.icode.ispring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class Tank {
    @Value(value = "${index:1}")
    private Integer index;
    private String name;

    public Tank() {
        System.out.println("tank加载");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Tank postConstruct");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void initMethod() {
        System.out.println("tank init ...");
    }
}

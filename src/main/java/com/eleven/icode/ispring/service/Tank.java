package com.eleven.icode.ispring.service;

import org.springframework.stereotype.Component;

//@Component
public class Tank {
    private Integer index;
    private String name;

    public Tank() {
        System.out.println("tank加载");
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
}

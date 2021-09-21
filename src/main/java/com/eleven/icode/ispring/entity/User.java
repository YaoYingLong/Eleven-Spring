package com.eleven.icode.ispring.entity;

/**
 * @author by YingLong on 2021/9/21
 */
public class User {
    private Integer id;
    private String name;
    private String address;

    public User() {
        System.out.println("User加载");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

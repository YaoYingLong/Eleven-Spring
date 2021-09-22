package com.eleven.icode.ispring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Car {
    private String name;
    private Tank tank;
    private Tank tank2;

    public void setTank(Tank tank) {
        this.tank = tank;
    }
    public void setTank2(Tank tank) {
        this.tank2 = tank;
    }

    public Tank getTank() {
        return tank;
    }
    public Tank getTank2() {
        return tank2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car() {
        System.out.println("car加载....");
    }

    public Car(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("car init ...");
    }
}

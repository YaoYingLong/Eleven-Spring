package com.eleven.icode.ispring.service;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String name;

    private Tank tank;

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Tank getTank() {
        return tank;
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
}

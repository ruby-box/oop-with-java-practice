package com.tdd.racing.entity.impl;

import com.tdd.racing.entity.ICar;

public class DefaultCar implements ICar {
    protected int speed; //속도
    private int number;     //차 번호(PK)
    private String name;

    public DefaultCar(int number) {
        this.number = number;
        this.speed = 1;
    }

    public DefaultCar(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    public DefaultCar(int number, int speed, String name) {
        this.number = number;
        this.speed = speed;
        this.name = name;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

}

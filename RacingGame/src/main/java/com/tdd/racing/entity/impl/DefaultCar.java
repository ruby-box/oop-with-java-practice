package com.tdd.racing.entity.impl;

import com.tdd.racing.entity.ICar;

public class DefaultCar implements ICar {
    protected int speed; //속도
    private int number;     //차 번호(PK)

    public DefaultCar(int number) {
        this.number = number;
        this.speed = 1;
    }

    public DefaultCar(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

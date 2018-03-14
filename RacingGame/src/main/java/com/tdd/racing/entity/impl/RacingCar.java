package com.tdd.racing.entity.impl;

import com.tdd.racing.util.RandomUtil;

public class RacingCar extends DefaultCar {
    private int location;    //레이싱게임에서 이동한 위치

    public RacingCar(int number) {
        super(number);
        this.location = 0;
    }

    public void move() {
        this.location += this.speed;
    }

    /***
     * 레이싱 게임에서 출발 여부 판단
     * @return
     */
    public boolean canMove() {
        if(RandomUtil.getRandomNumber(10) >= 4 ) return true;

        return false;
    }

    public int getLocation() {
        return this.location;
    }
}

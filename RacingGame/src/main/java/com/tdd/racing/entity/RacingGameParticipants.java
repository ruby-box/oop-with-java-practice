package com.tdd.racing.entity;

import com.tdd.racing.entity.impl.RacingCar;

import java.util.ArrayList;
import java.util.List;

/***
 * 레이싱게임 참여 레이싱차에 대한 정보를 가진 클래스
 */
public class RacingGameParticipants {
    private List<RacingCar> carList;    //참여 레이싱차

    public RacingGameParticipants(int count) {
        carList = new ArrayList<>();

        for(int i=0; i<count; i++) {
            carList.add(new RacingCar(i));
        }
    }

    public List<RacingCar> getCarList() {
        return this.carList;
    }

    public int getCarCount() {
        return this.carList.size();
    }
}

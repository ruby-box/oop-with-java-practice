package com.tdd.racing.service;

import com.tdd.racing.entity.impl.RacingCar;

import java.util.List;

public interface IGameRound {
    public void start(List<RacingCar> carList);
}

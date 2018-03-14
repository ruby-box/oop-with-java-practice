package com.tdd.racing.service;

import com.tdd.racing.entity.RacingGameRoundResultHistory;

public interface GameRound {
    public void start();

    public RacingGameRoundResultHistory end();
}

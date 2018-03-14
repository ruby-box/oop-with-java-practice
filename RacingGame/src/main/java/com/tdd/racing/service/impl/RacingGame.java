package com.tdd.racing.service.impl;

import com.tdd.racing.entity.RacingGameComponent;
import com.tdd.racing.service.Game;

/***
 * 레이싱 게임 클래스
 */
public class RacingGame implements Game {
    private RacingGameComponent component;  //게임에서 필요한 요소 정의(차, 라운드)

    public RacingGame(int carCount, int totalRound) {
        this.component = new RacingGameComponent(carCount, totalRound);
    }

    public RacingGameComponent getComponent() {
        return this.component;
    }

    /***
     * 레이싱 게임 시작
     */
    @Override
    public void start() {
        for(RacingGameRound round : this.component.getRoundList()) {
            round.start();
            this.component.addRoundHistory(round.end());
        }
    }
}

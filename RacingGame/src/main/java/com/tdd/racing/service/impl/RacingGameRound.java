package com.tdd.racing.service.impl;

import com.tdd.racing.entity.RacingGameRoundResultHistory;
import com.tdd.racing.entity.impl.RacingCar;
import com.tdd.racing.service.IGameRound;

import java.util.List;

/***
 * 레이싱 게임 라운드 클래스
 */
public class RacingGameRound implements IGameRound {
    private int roundNumber;    //라운드 번호(PK)
    private RacingGameRoundResultHistory history;

    public RacingGameRound(int roundNumber, List<RacingCar> carList) {
        this.roundNumber = roundNumber;
        this.history = new RacingGameRoundResultHistory(carList.size(), roundNumber);
    }

    public RacingGameRoundResultHistory getHistory() {
        return this.history;
    }

    /***
     * 라운드 플레이중
     * @param car
     */
    private void playRound(RacingCar car) {
        if(car.canMove()) {
            car.move();
        }

        this.history.saveCarLocation(car.getNumber(), car.getLocation());
    }

    /***
     * 라운드 시작
     */
    @Override
    public void start(List<RacingCar> carList) {
        for( RacingCar car : carList ) {
            playRound(car);
        }
    }
}

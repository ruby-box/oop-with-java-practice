package com.tdd.racing.service.impl;

import com.tdd.racing.entity.RacingGameParticipants;
import com.tdd.racing.entity.RacingGameRoundResultHistory;
import com.tdd.racing.entity.impl.RacingCar;
import com.tdd.racing.service.GameRound;

/***
 * 레이싱 게임 라운드 클래스
 */
public class RacingGameRound implements GameRound {
    private int roundNumber;    //라운드 번호(PK)
    private RacingGameParticipants participants;  //참여자 리스트
    private RacingGameRoundResultHistory history;

    public RacingGameRound(int roundNumber, RacingGameParticipants participantedCar) {
        this.roundNumber = roundNumber;
        this.participants = participantedCar;
        this.history = new RacingGameRoundResultHistory(this.participants.getCarCount(), roundNumber);
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
    public void start() {
        for( RacingCar car : this.participants.getCarList() ) {
            playRound(car);
        }
    }
}

package com.tdd.racing.entity;

/***
 * 레이싱게임 라운드의 결과 히스토리를 저장하기 위한 클래스
 */
public class RacingGameRoundResultHistory {
    private int roundNumber;
    private int[] carLocation;

    public RacingGameRoundResultHistory(int carCount, int roundNumber) {
        carLocation = new int[carCount];
        this.roundNumber = roundNumber;
    }

    public void saveCarLocation(int carNumber, int location) {
        this.carLocation[carNumber] = location;
    }

    public int getRoundNumber() {
        return this.roundNumber;
    }

    public int[] getCarLocation() {
        return this.carLocation;
    }

}

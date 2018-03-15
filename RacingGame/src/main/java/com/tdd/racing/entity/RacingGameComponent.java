package com.tdd.racing.entity;

import com.tdd.racing.service.impl.RacingGameRound;

import java.util.ArrayList;
import java.util.List;

/***
 * 레이싱게임의 구성요소를 담고있는 클래스
 */
public class RacingGameComponent {
    private int totalRound;     //총 라운드 수
    private int carCount;       //참여 레이싱차 수

    private RacingGameParticipants participants;    //참여 레이싱차
    private List<RacingGameRound> roundList;            //라운드 정보

    public RacingGameComponent(int carCount, int totalRound) {
        this.carCount = carCount;
        this.totalRound = totalRound;
        this.participants = new RacingGameParticipants(carCount);
        prepareRound(totalRound);
    }

    public RacingGameParticipants getParticipantedCar() {
        return this.participants;
    }

    public List<RacingGameRound> getRoundList() {
        return this.roundList;
    }

    /***
     * 라운드 준비
     * @param totalRound
     */
    private void prepareRound(int totalRound) {
        roundList = new ArrayList<>();

        for(int i=0; i<totalRound; i++) {
            roundList.add(new RacingGameRound(i, participants));
        }
    }
}

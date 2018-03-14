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
    private List<RacingGameRoundResultHistory> roundHistoryList;  //라운드 히스토리 저장

    public RacingGameComponent(int carCount, int totalRound) {
        this.carCount = carCount;
        this.totalRound = totalRound;
        this.roundHistoryList = new ArrayList<>();
        this.participants = new RacingGameParticipants(carCount);

        prepareRound(totalRound);
    }

    public RacingGameParticipants getParticipantedCar() {
        return this.participants;
    }

    public List<RacingGameRound> getRoundList() {
        return this.roundList;
    }

    private void prepareRound(int totalRound) {
        roundList = new ArrayList<>();

        for(int i=0; i<totalRound; i++) {
            roundList.add(new RacingGameRound(i, participants));
        }
    }

    public void addRoundHistory(RacingGameRoundResultHistory roundHistory) {
        this.roundHistoryList.add(roundHistory);
    }

    public List<RacingGameRoundResultHistory> getRoundHistoryList() {
        return this.roundHistoryList;
    }
}

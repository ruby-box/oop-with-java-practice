package com.tdd.racing.view.output;

import com.tdd.racing.entity.RacingGameComponent;
import com.tdd.racing.entity.RacingGameRoundResultHistory;
import com.tdd.racing.service.impl.RacingGame;
import com.tdd.racing.service.impl.RacingGameRound;

public class RacingGameOutput {
    private static final char charShape = '-';

    /***
     * 레이싱 게임 결과 출력
     * @param game
     */
    public static void printRacingGameResult(RacingGame game) {
        System.out.println("실행결과");

        RacingGameComponent component = game.getComponent();
        for(RacingGameRound round : component.getRoundList()) {
            printRacingGameHistory(round.getHistory());
        }

    }

    /***
     * 레이싱 게임 라운드별 히스토리 출력
     * @param history
     */
    protected static void printRacingGameHistory(RacingGameRoundResultHistory history) {
        for( int location : history.getCarLocation()) {
            System.out.println( visualizeLocation(location) );
        }

        System.out.println();
    }

    /***
     * 이동거리 시각화
     * @param location
     * @return
     */
    public static String visualizeLocation(int location) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<location; i++) {
            sb.append(charShape);
        }

        return sb.toString();
    }
}

package com.tdd.racing.view.input;

public class RacingGameInput extends DefaultInput{
    public static int inputCarCount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        int carCount = inputNumber();
        return carCount;
    }

    public static String inputCarsName() {
        System.out.println("자동차 이름을 입력해주세요");
        String carsName = inputString();
        return carsName;
    }

    public static int inputGameRound() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        int gameRound = inputNumber();
        return gameRound;
    }

}

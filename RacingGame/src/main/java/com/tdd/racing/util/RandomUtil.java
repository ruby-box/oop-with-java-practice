package com.tdd.racing.util;

import java.util.Random;

public class RandomUtil {
    private static Random random = new Random();

    /***
     * 랜덤 정수 난수 발생
     * @param bound
     * @return
     */
    public static int getRandomNumber(int bound) {
        return random.nextInt(bound);
    }
}

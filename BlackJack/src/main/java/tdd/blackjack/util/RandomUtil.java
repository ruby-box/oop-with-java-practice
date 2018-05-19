package tdd.blackjack.util;

import java.util.Random;

public class RandomUtil {
    private static Random random = new Random();

    public static int getRandomNumber() {
        return random.nextInt();
    }

    public static int getRandomNumber(int i) {
        return random.nextInt(i);
    }
}

package tdd.blackjack;

import org.junit.Before;
import org.junit.Test;
import tdd.blackjack.game.BlackJack;

import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.*;


public class BlackJackTest {
    BlackJack blackjack;

    @Before
    public void setup() {
        blackjack = new BlackJack();
        System.out.println("before : " + blackjack);
    }

}

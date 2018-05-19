package tdd.blackjack.card;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CardTest {
    CardDeck cardDeck;

    @Before
    public void setup() {
        cardDeck = new CardDeck();
        System.out.println("before : " + cardDeck);
    }
}

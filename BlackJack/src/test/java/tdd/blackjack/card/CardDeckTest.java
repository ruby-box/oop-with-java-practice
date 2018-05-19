package tdd.blackjack.card;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tdd.blackjack.game.BlackJack;
import tdd.blackjack.game.rule.impl.BlackJackRule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class CardDeckTest {
    CardDeck cardDeck;
    BlackJack blackJack;
    BlackJackRule rule;

    @Before
    public void setup() {
        blackJack = new BlackJack();
        rule = new BlackJackRule();
        cardDeck = new CardDeck();

        blackJack.prepareCardDeck();
        cardDeck = blackJack.getCardDeck();

        System.out.println("before cardDeck : " + cardDeck);
        System.out.println("before rule : " + rule);
        System.out.println("before blackJack : " + blackJack);
    }

    @Test
    public void 카드섞기() {
        Card card;
        Map<String, String> resultCard = new HashMap<String, String>();

        for( int i=0; i<10; i++ ) {
            cardDeck.suffle();
            card =  cardDeck.getFirstCard();
            resultCard.put(card.getShape(), card.getNumber());
            assertThat(card).extracting("shape");
        }
    }
}

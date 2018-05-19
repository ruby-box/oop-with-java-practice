package tdd.blackjack.game.rule;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tdd.blackjack.card.Card;
import tdd.blackjack.card.CardDeck;
import tdd.blackjack.card.blackjack.CardNumber;
import tdd.blackjack.card.blackjack.CardShape;
import tdd.blackjack.game.BlackJack;
import tdd.blackjack.game.rule.impl.BlackJackRule;

import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.*;

public class BlackJackRuleTest {
    BlackJack blackJack;
    BlackJackRule rule;

    String[] shapes = {
            CardShape.SPADE.getShape(),
            CardShape.DIAMOND.getShape(),
            CardShape.CLOVER.getShape(),
            CardShape.HEART.getShape()
    };

    @Before
    public void setup() {
        blackJack = new BlackJack();
        rule = new BlackJackRule();
        System.out.println("before : " + rule);
    }

    @After
    public void after() {

    }

    @Test
    public void 생성된_덱의_카드가_네가지모양_중_하나를_가진다() {
        blackJack.prepareCardDeck();

        CardDeck deck = blackJack.getCardDeck();

        for(Card card : deck.getCardList()) {
            assertThat(card).extracting("shape").containsAnyOf(
                    CardShape.SPADE.getShape(),
                    CardShape.DIAMOND.getShape(),
                    CardShape.CLOVER.getShape(),
                    CardShape.HEART.getShape());
        }
    }

    @Test
    public void 생성된_덱의_카드의_숫자를_A부터K까지_모두가지고있다() {
        blackJack.prepareCardDeck();

        CardDeck deck = blackJack.getCardDeck();

        assertThat(deck.getCardList()).extracting(Card::getNumber).contains(
                CardNumber.A.getShape(),
                CardNumber.TWO.getShape(),
                CardNumber.THREE.getShape(),
                CardNumber.FOUR.getShape(),
                CardNumber.FIVE.getShape(),
                CardNumber.SIX.getShape(),
                CardNumber.SEVEN.getShape(),
                CardNumber.EIGHT.getShape(),
                CardNumber.NINE.getShape(),
                CardNumber.TEN.getShape(),
                CardNumber.J.getShape(),
                CardNumber.Q.getShape(),
                CardNumber.K.getShape()
        );
    }

    //TODO 카드 stack으로 바꾸기
    @Test
    public void 카드는_52장이다() {
        assertThat(rule.createCardDeck().getCardList().size()).isEqualTo(52);
    }
}

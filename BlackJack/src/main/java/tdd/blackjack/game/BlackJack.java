package tdd.blackjack.game;

import tdd.blackjack.card.CardDeck;
import tdd.blackjack.game.rule.impl.BlackJackRule;

public class BlackJack {
    private CardDeck cardDeck;

    public CardDeck getCardDeck() {
        return cardDeck;
    }

    public void prepareCardDeck() {
        this.cardDeck = BlackJackRule.createCardDeck();
    }
}

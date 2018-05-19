package tdd.blackjack.game.rule.impl;

import tdd.blackjack.card.Card;
import tdd.blackjack.card.CardDeck;
import tdd.blackjack.card.blackjack.CardShape;
import tdd.blackjack.card.blackjack.CardNumber;
import tdd.blackjack.util.RandomUtil;

import java.util.List;

public class BlackJackRule {

    public Card selectCard(CardDeck cardDeck) {
        List<Card> cardList = cardDeck.getCardList();
        return cardList.get(RandomUtil.getRandomNumber(cardList.size() - 1));
    }

    public static CardDeck createCardDeck() {
        CardDeck cardDeck = new CardDeck();

        cardDeck.addDeck(createCardDeck(CardShape.HEART));
        cardDeck.addDeck(createCardDeck(CardShape.DIAMOND));
        cardDeck.addDeck(createCardDeck(CardShape.SPADE));
        cardDeck.addDeck(createCardDeck(CardShape.CLOVER));

        return cardDeck;
    }

    private static CardDeck createCardDeck(CardShape shape) {
        CardDeck newDeck = new CardDeck();
        Card newCard;

        for( int i=2; i<=10; i++ ) {
            newCard = new Card(shape.getShape(), Integer.toString(i), i);
            newDeck.addCard(newCard);
        }

        newDeck.addCard(new Card(shape.getShape(), CardNumber.A.getShape(), CardNumber.A.getScore()));
        newDeck.addCard(new Card(shape.getShape(), CardNumber.J.getShape(), CardNumber.J.getScore()));
        newDeck.addCard(new Card(shape.getShape(), CardNumber.Q.getShape(), CardNumber.Q.getScore()));
        newDeck.addCard(new Card(shape.getShape(), CardNumber.K.getShape(), CardNumber.K.getScore()));

        return newDeck;
    }
}

package tdd.blackjack.card;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CardDeck {
    private Stack<Card> cardList = new Stack<Card>();

    public int getCount() {
        return cardList.size();
    }

    public void addDeck(CardDeck cardDeck) {
        this.cardList.addAll(cardDeck.getCardList());
    }

    public List<Card> getCardList() {
        return this.cardList;
    }

    public void addCard(Card newCard) {
        cardList.add(newCard);
    }

    public void suffle() {
    }

    public Card getFirstCard() {
        return cardList.pop();
    }
}

package tdd.blackjack.card;

public class Card {
    private String number;
    private String shape;
    private int score;

    public Card(String shape, String number, int score) {
        this.shape = shape;
        this.number = number;
        this.score = score;
    }

    public String getShape() {
        return this.shape;
    }

    public String getNumber() {
        return this.number;
    }

    public int getScore() {
        return this.score;
    }
    public Card(String shape, String number) {
        this.shape = shape;
        this.number = number;
    }
}

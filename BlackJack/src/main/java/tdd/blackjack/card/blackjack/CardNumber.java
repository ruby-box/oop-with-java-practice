package tdd.blackjack.card.blackjack;

public enum CardNumber {
    A("A", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    Q("Q", 10),
    K("K", 10),
    J("J", 10);


    String shape;
    int score;

    private CardNumber(String shape, int score) {
        this.shape = shape;
        this.score = score;
    }

    public String getShape() {
        return shape;
    }

    public int getScore() {
        return score;
    }
}
package tdd.blackjack.card.blackjack;

public enum CardShape {
    DIAMOND("DIAMOND"),
    SPADE("SPADE"),
    HEART("HEART"),
    CLOVER("CLOVER");

    private String shape;

    private CardShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return this.shape;
    }
}


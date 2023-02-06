package EO5;

class Card {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public boolean beats(Card otherCard) {
        if (this.value > otherCard.value) {
            return true;
        } else if (this.value == otherCard.value) {
            if (this.suit.equals("spades")) {
                return true;
            } else if (this.suit.equals("hearts")) {
                return !otherCard.suit.equals("spades");
            } else if (this.suit.equals("diamonds")) {
                return otherCard.suit.equals("clubs");
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Card card1 = new Card("spades",6);
        Card card2 = new Card("hearts",6);
        Card card3 = new Card("diamonds",2);
        Card card4 = new Card("clubs",4);

        System.out.println(card1.beats(card2));
        System.out.println(card2.beats(card3));
        System.out.println(card3.beats(card4));
        System.out.println(card4.beats(card1));
    }
}
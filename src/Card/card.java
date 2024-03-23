package Card;

public class card {
    private String value;
    private String suit;

    public void Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public card(String ace, String hearts) {
    }

    public String getValue() {
        return this.value;
    }

    public String getSuit() {
        return this.suit;
    }

    public boolean equals(card other) {
        return this.value.equals(other.value) && this.suit.equals(other.suit);
    }

    public boolean isLessThan(card other) {
        if (this.value.compareTo(other.value) < 0) {
            return true;
        } else if (this.value.equals(other.value)) {
            return this.suit.compareTo(other.suit) < 0;
        } else {
            return false;
        }
    }

    public boolean isGreaterThan(card other) {
        return !(isLessThan(other) || equals(other));
    }

    @Override
    public String toString() {
        return this.value + " of " + this.suit;
    }
}

package Card;

public class main {
    public static void main(String[] args) {
        card card1 = new card("Ace", "Hearts");
        card card2 = new card("King", "Spades");

        System.out.println("Carta 1: " + card1);
        System.out.println("Carta 2: " + card2);

        if (card1.equals(card2)) {
            System.out.println("As duas cartas são iguais.");
        } else if (card1.isLessThan(card2)) {
            System.out.println("A carta 1 é menor do que a carta 2.");
        } else {
            System.out.println("A carta 1 é maior do que a carta 2.");
        }
    }
}

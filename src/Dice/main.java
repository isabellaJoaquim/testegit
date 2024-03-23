package Dice;

public class main {
    public static void main(String[] args) {
        dice.Dice dado = new dice.Dice();

        int resultado = dado.roll();

        System.out.println("O resultado do lançamento do dado é: " + resultado);
    }
}

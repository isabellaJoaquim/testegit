package Estudante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Estudante estudante = new Estudante();

        estudante.adicionarNotas(5.6);
        estudante.adicionarNotas(9.2);
        estudante.adicionarNotas(8.7);

        System.out.println("Nome do estudante: ");
        System.out.println("Média do estudante; " + estudante.calcularMedia());

    }
}

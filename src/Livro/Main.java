package Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        livro livro = new livro();
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o titulo do livro: ");
        String titulo1 = livro.titulo;

        System.out.println("Informe o autor; ");
        String autor = livro.autor;
    }
}

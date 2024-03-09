package Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Contador meuContador = new Contador();

        meuContador.incrementar();
        meuContador.exibirValor();

        meuContador.incrementar();
        meuContador.exibirValor();

        meuContador.decrementar();
        meuContador.exibirValor();
    }
}


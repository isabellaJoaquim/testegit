package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double soma,n1,n2=0;
        Calculadora calculadora = new Calculadora();
       /* System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextDouble();
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextDouble();
        soma = calculadora.soma(n1, n2);*/

        double resultadoSoma = calculadora.soma(4,8);
        System.out.println("Soma: " + resultadoSoma);

        double resultadoSubtracao = calculadora.subtrai(7.0, 2.0);
        System.out.println("Subtração: " + resultadoSubtracao);

        double resultadoMultiplicacao = calculadora.multiplica(4.0, 6.0);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        double resultadoDivisao = calculadora.dividi(8.0, 2.0);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}


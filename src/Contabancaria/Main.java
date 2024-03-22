package Contabancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner ler = new Scanner(System.in);
        double valor;

        System.out.println("Informe o valor: ");
        valor = ler.nextDouble();
        contaBancaria.depositar(valor);
        contaBancaria.exibirSaldo();
        System.out.println("Digite o valor do saque: ");
        double saque = ler.nextDouble();
        contaBancaria.sacar(saque);
        contaBancaria.exibirSaldo();
    }
}

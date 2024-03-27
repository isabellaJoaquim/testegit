package atividade_avaliativa;

import java.util.Scanner;

public class MainPet {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = leia.next();
        System.out.println("Digite o especie:");
        String especie = leia.next();
        System.out.println("Digite o idade:");
        int idade = leia.nextInt();
        //método construtor construir o objeto
        Pet pet = new Pet(nome,especie,idade);
        Pet pet2 = new Pet();
        pet.exibir();
        pet2.exibir();
    }
}

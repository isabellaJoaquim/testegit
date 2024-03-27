package atividade_avaliativa;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Animal animal = new Animal();
        animal.setNome("Jurupeba");
        animal.setTipo("Galinha");
        animal.setIdade(20);
        System.out.println("Digite o som do animal:");
        String som = leia.next();
        animal.emitirSom(som);
    }
}
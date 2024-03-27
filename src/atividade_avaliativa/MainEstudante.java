package atividade_avaliativa;

public class MainEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Senai";
        estudante.anoDeNascimento = 2010;
        estudante.notaFinal = 8;
        System.out.println("Idade: " + estudante.calcularIdade(2024));
        System.out.println("Aprovado: " + estudante.estaAprovado());
    }
}

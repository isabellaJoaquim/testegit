package Gestaoescolar;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        estudante estudante = new estudante("João", 12345, 2022);

        professor professor = new professor("Maria", "Ciência da Computação");

        estudante.adicionarDisciplina(new disciplina("Matemática"));
        estudante.adicionarDisciplina(new disciplina("Física"));
        estudante.adicionarDisciplina(new disciplina("História"));

        professor.adicionarDisciplina(new disciplina("Programação"));
        professor.adicionarDisciplina(new disciplina("Banco de Dados"));

        estudante.listarDisciplinas();
        professor.listarDisciplinas();
    }
}

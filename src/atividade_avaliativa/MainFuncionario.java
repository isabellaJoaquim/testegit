package atividade_avaliativa;

import java.util.Scanner;

public class MainFuncionario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = leia.next();
        System.out.println("Departamento:");
        String departamento = leia.next();
        System.out.println("Salario:");
        double salario = leia.nextDouble();
        Funcionario funcionario =
                new Funcionario(nome,departamento,salario);
        System.out.println("Digite o novo nome:");
        nome = leia.next();
        funcionario.setNome(nome);
        System.out.println("Novo nome: "+funcionario.getNome());
        funcionario.aumentarSalario(10);
    }
}

package atividade_avaliativa;

public class Estudante {
    String nome;
    int anoDeNascimento;
    double notaFinal;
    public int calcularIdade(int anoAtual) {
        return anoAtual - anoDeNascimento;
    }
    public boolean estaAprovado() {
        return notaFinal >= 7;
    }
}


package Estudante;

public class Estudante {

    static int quantidadeDeNotas = 0;
    String nome;
    static Double[] notas;
    double soma = 0;

    public void estudante(){
        this.nome=nome;
    }
    public void adicionarNotas(double nota) {
        notas[quantidadeDeNotas] = nota;
        this.quantidadeDeNotas++;
    }

    public double calcularMedia() {
        if (quantidadeDeNotas == 0) {
            return 0.0;
        }
        for (int i = 0; i < quantidadeDeNotas; i++) {
            soma += notas[i];
        }
        return soma / quantidadeDeNotas;
    }
}


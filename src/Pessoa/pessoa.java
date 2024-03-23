package Pessoa;

public class pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String novoNome) {
        nome = novoNome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        idade = novaIdade;
    }

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

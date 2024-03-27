package Pessoa;

public class pessoa {
    public String nome;
    public int idade;
    public String Cpf;

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
    public String getCpf(){
        return Cpf;
    }
    public void setCpf(String novoCpf){
        Cpf = novoCpf;
    }

    public pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.Cpf=cpf;
    }
}

package atividade_avaliativa;

public class Pet {
    String nome;
    String especie;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Método Construtor
    //Cria um contrato de construção
    public Pet(String nome,String especie,int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }
    //construtor default ou padrão sem parametros
    public Pet(){

    }

    public void exibir(){
        System.out.println("Nome:"+this.nome);
        System.out.println("Espécie:"+this.especie);
        System.out.println("Idade:"+this.idade);
    }
}

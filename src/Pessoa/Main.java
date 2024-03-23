package Pessoa;

public class Main {
    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa("thor", 200);
        String nomeDaPessoa = pessoa1.getNome();
        pessoa1.setIdade(25);

        System.out.println("Nome: " + nomeDaPessoa);
        System.out.println("Idade: " + pessoa1.getIdade());
    }
}

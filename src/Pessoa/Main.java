package Pessoa;

public class Main {

    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa("thor", 200,"000.000.000-00");
        String nomeDaPessoa = pessoa1.getNome();
        pessoa1.setIdade(25);
        pessoa1.setCpf("000.000.000-00");

        System.out.println("Nome: " + nomeDaPessoa);
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("CPF: " + pessoa1.getCpf());
    }
}

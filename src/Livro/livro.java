package Livro;

public class livro {
    String titulo;
    String autor;
    int anoDePublicacao;

    public void exibirDetalhes(){
        System.out.println("Titulo do livro: " + this.titulo);
        System.out.println("Autor do livro: " + this.autor);
    }
}

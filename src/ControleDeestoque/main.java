package ControleDeestoque;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        gerenciarestoque gerenciamentoDeEstoque = new gerenciarestoque();


        gerenciamentoDeEstoque.adicionarProduto(new produto(1, "Camisa", 20, 29.99));
        gerenciamentoDeEstoque.adicionarProduto(new produto(2, "Calça", 15, 39.99));
        gerenciamentoDeEstoque.adicionarProduto(new produto(3, "Tênis", 10, 79.99));


        System.out.println("Lista de produtos abaixo do estoque mínimo:");
        gerenciamentoDeEstoque.listarProdutosBaixoEstoque(10);

        System.out.print("\nInforme o código do produto a ser removido: ");
        int codigoRemover = scanner.nextInt();
        gerenciamentoDeEstoque.removerProduto(codigoRemover);

        System.out.println("\nLista de produtos após a remoção:");
        gerenciamentoDeEstoque.listarProdutosBaixoEstoque(10);

    }
}


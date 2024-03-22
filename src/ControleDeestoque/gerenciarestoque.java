package ControleDeestoque;

import java.util.ArrayList;
import java.util.List;

public class gerenciarestoque {
    private List<produto> produtos;

    public gerenciarestoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(int codigo) {
        produtos.removeIf(produto -> produto.getCodigo() == codigo);
    }

    public void listarProdutosBaixoEstoque(int nivel) {
        System.out.println("Produtos com estoque abaixo de " + nivel + ":");
        for (produto produto : produtos) {
            if (produto.verificarEstoque(nivel)) {
                System.out.println("Código: " + produto.getCodigo() +
                        ", Descrição: " + produto.getDescricao() +
                        ", Quantidade em Estoque: " + produto.getQuantidadeEmEstoque() +
                        ", Preço: " + produto.getPreco());
            }
        }
    }
}

package ControleDeestoque;

import java.util.ArrayList;
import java.util.Scanner;
public class produto {
        private int codigo;
        private String descricao;
        private int quantidadeEmEstoque;
        private double preco;

        public produto(int codigo, String descricao, int quantidadeEmEstoque, double preco) {
            this.codigo = codigo;
            this.descricao = descricao;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
            this.preco = preco;
        }

        public void reporEstoque(int quantidade) {
            quantidadeEmEstoque += quantidade;
        }

        public void registrarVenda(int quantidade) {
            quantidadeEmEstoque -= quantidade;
        }

        public boolean verificarEstoque(int nivel) {
            return quantidadeEmEstoque < nivel;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getDescricao() {
            return descricao;
        }

        public int getQuantidadeEmEstoque() {
            return quantidadeEmEstoque;
        }

        public double getPreco() {
            return preco;
        }
    }

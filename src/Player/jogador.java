package Player;

import java.util.Scanner;
public class jogador {

    static class Player {
        private String nome;
        private int pontuacao;
        private int nivel;

        public Player(String nome) {
            this.nome = nome;
            this.pontuacao = 0;
            this.nivel = 1;
        }

        public void aumentarPontuacao(int pontos) {
            this.pontuacao += pontos;
            atualizarNivel();
        }

        private void atualizarNivel() {
            if (pontuacao >= 100) {
                this.nivel = 2;
            }
            if (pontuacao >= 200) {
                this.nivel = 3;
            }
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Pontuação: " + pontuacao);
            System.out.println("Nível: " + nivel);
        }
    }
}
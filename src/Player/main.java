package Player;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o nome do jogador
        System.out.print("Informe o nome do jogador: ");
        String nomeJogador = scanner.nextLine();

        // Criar um novo jogador
        jogador.Player jogador = new jogador.Player(nomeJogador);

        // Exibir informações iniciais do jogador
        System.out.println("\nInformações iniciais do jogador:");
        jogador.exibirInformacoes();

        // Simular aumento de pontuação e atualização de nível
        jogador.aumentarPontuacao(50);
        System.out.println("\nPontuação aumentada em 50 pontos...");
        jogador.exibirInformacoes();

        jogador.aumentarPontuacao(100);
        System.out.println("\nPontuação aumentada em 100 pontos...");
        jogador.exibirInformacoes();
    }
}

package CadastroVeiculo;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        concessionaria concessionaria1 = new concessionaria();

        // Adicionando alguns veículos de exemplo
        concessionaria1.adicionarVeiculo(new veiculos("ABC123", "Gol", 2020, "Prata", 30000));
        concessionaria1.adicionarVeiculo(new veiculos("XYZ789", "Civic", 2018, "Preto", 70000));
        concessionaria1.adicionarVeiculo(new veiculos("DEF456", "Corolla", 2019, "Branco", 65000));

        // Exemplo de utilização dos métodos
        System.out.println("Lista de veículos na concessionária:");
        veiculos gol = concessionaria.buscarVeiculoPorModelo("Gol");
        if (gol != null) {
            gol.exibirInformacoes();
        } else {
            System.out.println("Veículo não encontrado.");
        }

        System.out.println("\nRemovendo o veículo Gol...");
        concessionaria.removerVeiculo("Gol");

        System.out.println("\nLista de veículos após a remoção:");
        concessionaria.listarVeiculosPorFaixaDePreco(0, Double.MAX_VALUE);
    }
}

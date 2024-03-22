package Cadastroveiculos;

import java.util.ArrayList;
import java.util.List;

public class concessionaria {
    private List<veiculos> veiculos;

    public concessionaria() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(veiculos veiculo) {
        veiculos.add(veiculo);
    }

    public static void removerVeiculo(String modelo) {
        veiculos.removeIf(veiculo -> veiculo.getModelo().equalsIgnoreCase(modelo));
    }

    public static veiculos buscarVeiculoPorModelo(String modelo) {
        for (veiculos veiculo : veiculos) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                return veiculo;
            }
        }
        return null; // Retorna null se o veículo não for encontrado
    }

    public static void listarVeiculosPorFaixaDePreco(double minPreco, double maxPreco) {
        System.out.println("Veículos na faixa de preço entre " + minPreco + " e " + maxPreco + ":");
        for (veiculos veiculo : veiculos) {
            if (veiculo.getPreco() >= minPreco && veiculo.getPreco() <= maxPreco) {
                veiculo.exibirInformacoes();
                System.out.println();
            }
        }
    }
}

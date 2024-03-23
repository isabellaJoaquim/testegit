package CadastroVeiculo;

import java.util.ArrayList;
import java.util.List;

public class concessionaria {
    private static List<veiculos> veiculos;

    public concessionaria() {
        this.veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(veiculos veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo adicionado com sucesso.");
    }

    public static void removerVeiculo(String veiculo) {
        if (veiculos.remove(veiculo)) {
            System.out.println("Veículo removido com sucesso.");
        } else {
            System.out.println("Veículo não encontrado na concessionária.");
        }
    }

    public static veiculos buscarVeiculoPorModelo(String modelo) {
        for (veiculos veiculo : veiculos) {
            if (veiculo.getModelo().equalsIgnoreCase(modelo)) {
                return veiculo;
            }
        }
        return null;
    }

    public static List<veiculos> listarVeiculosPorFaixaDePreco(double precoMin, double precoMax) {
        List<veiculos> veiculosNaFaixaDePreco = new ArrayList<>();
        for (veiculos veiculo : veiculos) {
            if (veiculo.getPreco() >= precoMin && veiculo.getPreco() <= precoMax) {
                veiculosNaFaixaDePreco.add(veiculo);
            }
        }
        return veiculosNaFaixaDePreco;
    }
}

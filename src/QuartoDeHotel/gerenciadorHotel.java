package QuartoDeHotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gerenciadorHotel {

    public List<quartoDeHotel> quartos;

    public void GerenciadorDeHotel() {
        this.quartos = new ArrayList<>();
    }
    public void adicionarQuarto(int numeroDoQuarto, boolean disponivel, String tipo, double precoPorNoite) {
        quartoDeHotel quarto = new quartoDeHotel(numeroDoQuarto, disponivel, tipo, precoPorNoite);
        quartos.add(quarto);
        System.out.println("Quarto " + numeroDoQuarto + " adicionado com sucesso.");
    }

    public <QuartoDeHotel> void removerQuarto(int numeroDoQuarto) {
        for (quartoDeHotel quarto : quartos) {
            if (quarto.getNumeroDoQuarto() == numeroDoQuarto) {
                quartos.remove(quarto);
                System.out.println("Quarto " + numeroDoQuarto + " removido com sucesso.");
                return;
            }
        }
        System.out.println("Quarto " + numeroDoQuarto + " não encontrado.");
    }

    public quartoDeHotel buscarQuartoDisponivel(String tipo) {
        for (quartoDeHotel quarto : quartos) {
            if (quarto.getTipo().equalsIgnoreCase(tipo) && quarto.isDisponivel()) {
                return quarto;
            }
        }
        System.out.println("Nenhum quarto do tipo " + tipo + " disponível.");
        return null;
    }

    public void realizarCheckout(int numeroDoQuarto, int numeroDeNoites) {
        for (quartoDeHotel quarto : quartos) {
            if (quarto.getNumeroDoQuarto() == numeroDoQuarto) {
                double precoTotal = quarto.calcularPrecoEstadia(numeroDeNoites);
                quarto.cancelarReserva();
                System.out.println("Checkout realizado para o quarto " + numeroDoQuarto + ". Preço total: " + precoTotal);
                return;
            }
        }
        System.out.println("Quarto " + numeroDoQuarto + " não encontrado para realizar o checkout.");
    }

    public static void main(String[] args) {
        gerenciadorHotel gerenciador = new gerenciadorHotel();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar Quarto");
            System.out.println("2. Remover Quarto");
            System.out.println("3. Buscar Quarto Disponível");
            System.out.println("4. Realizar Checkout");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Número do quarto: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o número
                    System.out.print("Tipo de quarto: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Preço por noite: ");
                    double preco = scanner.nextDouble();
                    gerenciador.adicionarQuarto(numero, true, tipo, preco);
                    break;
                case 2:
                    System.out.print("Número do quarto a ser removido: ");
                    int numeroRemover = scanner.nextInt();
                    gerenciador.removerQuarto(numeroRemover);
                    break;
                case 3:
                    System.out.print("Tipo de quarto desejado: ");
                    String tipoBuscar = scanner.next();
                    quartoDeHotel quartoDisponivel = gerenciador.buscarQuartoDisponivel(tipoBuscar);
                    if (quartoDisponivel != null) {
                        System.out.println("Quarto disponível encontrado: " + quartoDisponivel.getNumeroDoQuarto());
                    }
                    break;
                case 4:
                    System.out.print("Número do quarto para realizar checkout: ");
                    int numeroCheckout = scanner.nextInt();
                    System.out.print("Número de noites: ");
                    int numeroNoites = scanner.nextInt();
                    gerenciador.realizarCheckout(numeroCheckout, numeroNoites);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
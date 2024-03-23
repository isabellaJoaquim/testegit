package CadastroVeiculo;

public class veiculos {

        private String placa;
        private String modelo;
        private int ano;
        private String cor;
        private double preco;

        public veiculos(String placa, String modelo, int ano, String cor, double preco) {
            this.placa = placa;
            this.modelo = modelo;
            this.ano = ano;
            this.cor = cor;
            this.preco = preco;
        }

        public void exibirInformacoes() {
            System.out.println("Placa: " + placa);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Cor: " + cor);
            System.out.println("Preço: " + preco);
        }

        public void atualizarPreco(double novoPreco) {
            this.preco = novoPreco;
        }

        public double getPreco() {
            return preco;
        }

        public String getModelo() {
            return modelo;
        }
    }
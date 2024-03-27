package atividade_avaliativa;

public class MainContador {
    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.valor = 10;
        contador.incrementar();
        contador.incrementar();
        contador.decrementar();
        contador.exibirValorAtual();
    }
}

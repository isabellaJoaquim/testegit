package atividade_avaliativa;

public class Contador {
    int valor;
    public void incrementar(){
        this.valor++;
        //this.valor = this.valor + 1;
    }
    public void decrementar(){
        this.valor--;
    }
    public void exibirValorAtual(){
        System.out.println("O valor atual é:"+this.valor);
    }
}

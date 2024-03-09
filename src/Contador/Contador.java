package Contador;

public class Contador {

    int valor;

    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        valor--;
    }

    public void exibirValor() {
        System.out.println("Valor atual do contador: " + valor);
    }
}

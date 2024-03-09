package Calculadora;

public class Calculadora {

    public double soma(double a, double b) {
        return a + b;
    }

    public double subtrai(double a, double b) {
        return a - b;
    }

    public double multiplica(double a, double b) {
        return a * b;
    }
    public double dividi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
    }
}
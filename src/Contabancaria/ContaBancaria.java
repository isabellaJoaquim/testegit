package Contabancaria;

public class ContaBancaria {

    public int numeroDaConta;
    public String nomeDoTitular;
    public double saldo;

    public void ContaBancaria(int numeroDaConta, String nomeDoTitular, double saldo){
        this.numeroDaConta=numeroDaConta;
        this.nomeDoTitular=nomeDoTitular;
        this.saldo=saldo;
    }
    public void depositar(double valor){
        saldo+=valor;
        System.out.println("Dépodito de valor " + valor + "\nRealizado com sucesso!");
    }
    public void sacar (double saque){
        if ((this.saldo>= 0) && (saque<= this.saldo)){
            this.saldo = this.saldo-saque;
        }else{
            System.out.println("Saldo insufisiente");
        }
    }
    public void exibirSaldo(){
        System.out.println("Novo saldo: " + this.saldo);
    }
}

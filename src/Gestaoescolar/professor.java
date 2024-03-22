package Gestaoescolar;

public class professor extends pessoa {
    private String departamento;

    public professor(String nome, String departamento) {
        super(nome);
        this.departamento = departamento;
    }
}

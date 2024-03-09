package Relogio;

public class Main {
    public static void main(String[] args) {
        Relogio relogio1 = new Relogio(2,15,30);

        relogio1.adicionarHora(2);
        relogio1.adicionarMinuto(15);
        relogio1.adicionarSegundo(30);

        System.out.println("Horário Final:");
        relogio1.exibirHorario();
    }
}

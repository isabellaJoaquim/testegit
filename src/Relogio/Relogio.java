package Relogio;

public class Relogio {

        private int hora;
        private int minuto;
        private int segundo;

        public Relogio(int hora, int minuto, int segundo) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }

        public void adicionarHora(int horas) {
            hora = (hora + horas) % 24;
        }

        public void adicionarMinuto(int minutos) {
            hora = (hora + (minuto + minutos) / 60) % 24;
            minuto = (minuto + minutos) % 60;
        }

        public void adicionarSegundo(int segundos) {
            minuto = (minuto + (segundo + segundos) / 60) % 60;
            segundo = (segundo + segundos) % 60;
        }

        public void exibirHorario() {
            System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
        }
}



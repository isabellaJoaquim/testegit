package QuartoDeHotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quartoDeHotel {
        public int numeroDoQuarto;
        public boolean disponivel;
        public String tipo;
        public double precoPorNoite;

        public quartoDeHotel(int numeroDoQuarto, boolean disponivel, String tipo, double precoPorNoite) {
            this.numeroDoQuarto = numeroDoQuarto;
            this.disponivel = disponivel;
            this.tipo = tipo;
            this.precoPorNoite = precoPorNoite;
        }

        public void fazerReserva() {
            if (disponivel) {
                disponivel = false;
                System.out.println("Quarto " + numeroDoQuarto + " reservado com sucesso.");
            } else {
                System.out.println("Quarto " + numeroDoQuarto + " não está disponível para reserva.");
            }
        }

        public void cancelarReserva() {
            disponivel = true;
            System.out.println("Reserva do quarto " + numeroDoQuarto + " cancelada.");
        }

        public double calcularPrecoEstadia(int numeroDeNoites) {
            return precoPorNoite * numeroDeNoites;
        }

        public int getNumeroDoQuarto() {
            return numeroDoQuarto;
        }

        public boolean isDisponivel() {
            return disponivel;
        }

        public String getTipo() {
            return tipo;
        }
    }
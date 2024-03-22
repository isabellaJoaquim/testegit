package Consultamedica;

import java.time.LocalDateTime;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        gerenciarConsulta gerenciadorDeConsultas = new gerenciarConsulta();

        gerenciadorDeConsultas.adicionarConsulta(new consultaMedica(LocalDateTime.of(2024, 3, 25, 10, 0), "João", "Dr. Silva", "Cardiologia"));
        gerenciadorDeConsultas.adicionarConsulta(new consultaMedica(LocalDateTime.of(2024, 3, 26, 14, 30), "Maria", "Dra. Santos", "Pediatria"));
        gerenciadorDeConsultas.adicionarConsulta(new consultaMedica(LocalDateTime.of(2024, 3, 26, 16, 0), "Pedro", "Dr. Almeida", "Ortopedia"));

        System.out.print("Informe a data das consultas a serem listadas (no formato YYYY-MM-DD): ");
        String dataInput = scanner.nextLine();
        LocalDateTime data = LocalDateTime.parse(dataInput + "T00:00:00");

        gerenciadorDeConsultas.listarConsultasPorData(data);
}
}

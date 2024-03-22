package Consultamedica;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class gerenciarConsulta {

    private List<consultaMedica> consultas;

    public gerenciarConsulta() {
        consultas = new ArrayList<>();
    }

    public void adicionarConsulta(consultaMedica consulta) {
        consultas.add(consulta);
    }

    public void cancelarConsulta(LocalDateTime dataHora) {
        consultas.removeIf(consulta -> consulta.getDataHora().equals(dataHora));
    }

    public void listarConsultasPorData(LocalDateTime data) {
        System.out.println("Consultas agendadas para o dia " + data + ":");
        for (consultaMedica consulta : consultas) {
            if (consulta.getDataHora().toLocalDate().equals(data.toLocalDate())) {
                System.out.println("Paciente: " + consulta.getPaciente() +
                        ", Médico: " + consulta.getMedico() +
                        ", Especialidade: " + consulta.getEspecialidade() +
                        ", Data e Hora: " + consulta.getDataHora());
            }
        }
    }
}

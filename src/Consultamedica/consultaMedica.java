package Consultamedica;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class consultaMedica {
        private LocalDateTime dataHora;
        private String paciente;
        private String medico;
        private String especialidade;

        public consultaMedica(LocalDateTime dataHora, String paciente, String medico, String especialidade) {
            this.dataHora = dataHora;
            this.paciente = paciente;
            this.medico = medico;
            this.especialidade = especialidade;
        }

        public void alterarDataHora(LocalDateTime novaDataHora) {
            this.dataHora = novaDataHora;
        }

        public LocalDateTime getDataHora() {
            return dataHora;
        }

        public String getPaciente() {
            return paciente;
        }

        public String getMedico() {
            return medico;
        }

        public String getEspecialidade() {
            return especialidade;
        }
    }

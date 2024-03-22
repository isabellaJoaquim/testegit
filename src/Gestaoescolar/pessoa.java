package Gestaoescolar;

import java.util.ArrayList;
import java.util.List;

public class pessoa {
    protected String nome;
    protected List<disciplina> disciplinas;

    public pessoa(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(disciplina disciplina) {
        disciplinas.remove(disciplina);
    }
    public void listarDisciplinas() {
        System.out.println("Disciplinas de " + nome + ":");
        for (disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }
}

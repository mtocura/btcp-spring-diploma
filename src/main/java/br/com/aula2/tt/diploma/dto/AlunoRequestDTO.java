package br.com.aula2.tt.diploma.dto;

import br.com.aula2.tt.diploma.model.Disciplina;

import java.util.List;

public class AlunoRequestDTO {
    private String nome;
    private List<Disciplina> disciplinas;

    public AlunoRequestDTO(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}

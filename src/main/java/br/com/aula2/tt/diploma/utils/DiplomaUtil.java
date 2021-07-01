package br.com.aula2.tt.diploma.utils;

import br.com.aula2.tt.diploma.model.Disciplina;

import java.util.List;

public class DiplomaUtil {
    public Double calculaMedia(List<Disciplina> disciplinas) {
        double media = 0.0;

        for(Disciplina disciplina : disciplinas) {
            media += disciplina.getNota();
        }

        return media;
    }
}

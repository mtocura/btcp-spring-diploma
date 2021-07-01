package br.com.aula2.tt.diploma.utils;

import br.com.aula2.tt.diploma.model.Disciplina;

import java.util.List;

public class DiplomaUtil {
    public static Double calculaMedia(List<Disciplina> disciplinas) {
        double media = 0.0;

        for(Disciplina disciplina : disciplinas) {
            media += disciplina.getNota();
        }

        return media / disciplinas.size();
    }

    public static String mensagem(double nota) {
        if(nota < 3 && nota >= 0) {
            return "Reprovado";
        } else if(nota < 9) {
            return "Aprovado";
        } else {
            return "Aprovado! Parabéns!!";
        }
    }
}

package br.com.aula2.tt.diploma.controller;

import br.com.aula2.tt.diploma.dto.AlunoRequestDTO;
import br.com.aula2.tt.diploma.dto.AlunoResponseDTO;
import br.com.aula2.tt.diploma.utils.DiplomaUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aula2/tt")
public class DiplomaController {

    @PostMapping("/diploma")
    public ResponseEntity<?> diploma(@RequestBody AlunoRequestDTO aluno) {
        double media = DiplomaUtil.calculaMedia(aluno.getDisciplinas());
        String mensagem = DiplomaUtil.mensagem(media);

        AlunoResponseDTO res = new AlunoResponseDTO(mensagem, media, aluno.getNome());

        return ResponseEntity.ok(res);
    }
}

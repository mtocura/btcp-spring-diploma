package br.com.aula2.tt.diploma.dto;

public class AlunoResponseDTO {
    private String mensagem;
    private Double media;
    private String aluno;

    public AlunoResponseDTO(String mensagem, Double media, String aluno) {
        this.mensagem = mensagem;
        this.media = media;
        this.aluno = aluno;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Double getMedia() {
        return media;
    }

    public String getAluno() {
        return aluno;
    }
}

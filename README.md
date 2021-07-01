# Aula 2 - Estender métodos web e JSON - TT

## Prática: Obter Diplomas

Resolução do exercício prático individual.

- POST ```` /aula2/tt/diploma ````
  - body request
  ````
  {
    "nome": "Aluno Teste",
    "disciplinas": [
        {
            "nome": "Cálculo I",
            "nota": 8.5
        },
        {
            "nome": "Introdução a Programação",
            "nota": 9
        },
        {
            "nome": "Algoritmo e Estruturas de Dados I",
            "nota": 8.5
        },
        {
            "nome": "Cálculo II",
            "nota": 9.8
        }
    ]
  }
  ````
  
  - body response
  ````
  {
    "mensagem": "Aprovado",
    "media": 8.625,
    "aluno": "Aluno Teste"
  }
  ````

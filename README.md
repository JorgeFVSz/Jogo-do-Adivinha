# Jogo de Adivinhação

Este é um jogo simples de adivinhação onde o usuário tenta adivinhar um número sorteado dentro de um intervalo determinado pela dificuldade escolhida. O jogo apresenta três níveis de dificuldade: **Fácil**, **Médio**, e **Difícil**.

## Funcionalidade

1. O jogo sorteia um número aleatório dentro de um intervalo de acordo com a dificuldade selecionada:
    - **Fácil**: Números entre 1 e 10.
    - **Médio**: Números entre 1 e 50.
    - **Difícil**: Números entre 1 e 100.

2. O jogador deve inserir um palpite e o sistema compara o palpite com o número sorteado.
    - Se o palpite estiver correto, o jogador ganha 10 pontos.
    - Se o palpite estiver a 1 número de distância, o jogador ganha 5 pontos.
    - Se o palpite estiver errado, o jogador não ganha pontos.

3. O jogo continua até que o jogador decida parar. Ao final, o sistema exibe:
    - Pontuação final.
    - Lista dos números que o jogador acertou.
    - Lista dos números que o jogador errou.

## Requisitos

- **Java 8** ou superior.

## Como jogar

1. Ao iniciar o jogo, o sistema pedirá para o jogador escolher um nível de dificuldade:
    - **Fácil**: Números entre 1 e 10.
    - **Médio**: Números entre 1 e 50.
    - **Difícil**: Números entre 1 e 100.

2. O jogador deve inserir um palpite no intervalo adequado para o nível escolhido.

3. O jogo continuará até que o jogador decida parar, respondendo **S** (Sim) ou **N** (Não) quando perguntado se deseja continuar jogando.

## Exemplo de Execução

#### Bem Vindo ao Jogo adivinha: tente adivinhar o número sorteado. 
#### Escolha um nível de dificuldade
#### Fácil: Números entre 1 e 10. 
#### Médio: Números entre 1 e 50.
#### Difícil: Números entre 1 e 100. 
Exemplo usúario digitou ``` Fácil ``` 
#### Digite um número de 1 a 10:
Exemplo usúario digitou `````5`````
#### Parabens você acertou! o número sorteado foi: 5
#### Você ganhou 10 pontos!

Deseja continuar jogando? S/N Pontuação total: 10

#### Exemplo usúario digitou ````N````

#### Pontuação final: 10
#### Números acertados: [5]
#### Números errados: []

## Detalhes do código

- **Random**: Usado para gerar números aleatórios para o sorteio.
- **Scanner**: Usado para capturar as entradas do jogador (nível de dificuldade e palpite).
- **List**: Usada para armazenar os números acertados e errados pelo jogador.
- **Pontuação**: A pontuação é acumulada ao longo das tentativas e é exibida no final do jogo.
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem Vindo ao Jogo adivinha: tente adivinhar o número sorteado.");

        int pontuacao = 0;
        boolean continuarJogando = true;

        while (continuarJogando) {

            int numeroSorteadoFacil = random.nextInt(10) + 1;
            int numeroSorteadoMedio = random.nextInt(50) + 1;
            int numeroSorteadoDificil = random.nextInt(100) + 1;

            System.out.println("Escolha um nível de dificuldade");
            System.out.println("Fácil: Números entre 1 e 10.");
            System.out.println("Médio: Números entre 1 e 50.");
            System.out.println("Difícil: Números entre 1 e 100.");

            String nivelDeDificuldade = scanner.next();

            int numeroSorteadoEscolhaUsuario = 0;

            if (nivelDeDificuldade.equals("Fácil")) {
                numeroSorteadoEscolhaUsuario = numeroSorteadoFacil;
                System.out.println("Digite um número de 1 a 10:");
            } else if (nivelDeDificuldade.equals("Médio")) {
                numeroSorteadoEscolhaUsuario = numeroSorteadoMedio;
                System.out.println("Digite um número de 1 a 50:");
            } else if (nivelDeDificuldade.equals("Difícil")) {
                numeroSorteadoEscolhaUsuario = numeroSorteadoDificil;
                System.out.println("Digite um número de 1 a 100:");
            }

            System.out.println("Teste numero sorteado " + numeroSorteadoEscolhaUsuario);

            int palpiteUsuario = scanner.nextInt();

            if (numeroSorteadoEscolhaUsuario == palpiteUsuario) {
                pontuacao += 10;
                System.out.println("Parabens você acertou! o número sorteado foi: " + numeroSorteadoEscolhaUsuario);
                System.out.println("Você ganhou 10 pontos!");
            } else if (Math.abs(numeroSorteadoEscolhaUsuario - palpiteUsuario) == 1) {
                System.out.println("Quase lá! Você estava a 1 de distância do número sorteado.");
                pontuacao += 5;
                System.out.println("Você ganhou 5 pontos");
            } else {
                System.out.println("Você errou o numero sorteado era: " + numeroSorteadoEscolhaUsuario);
            }

            System.out.println("Pontuação total: " + pontuacao);
            System.out.println("Deseja continuar jogando? S/N");
            String continuar = scanner.next();

            if (!continuar.equals("S")) {
                continuarJogando = false;
            }

        }
        scanner.close();
    }
}
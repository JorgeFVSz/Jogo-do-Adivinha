import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem Vindo ao Jogo adivinha: tente adivinhar o número sorteado.");

        int pontuacao = 0;
        boolean continuarJogando = true;
        List<Integer> numerosAcertados = new ArrayList<>();
        List<Integer> numerosErrados = new ArrayList<>();

        while (continuarJogando) {

            int numeroSorteadoFacil = random.nextInt(10) + 1;
            int numeroSorteadoMedio = random.nextInt(50) + 1;
            int numeroSorteadoDificil = random.nextInt(100) + 1;

            System.out.println("Escolha um nível de dificuldade");
            System.out.println("Fácil: Números entre 1 e 10.");
            System.out.println("Médio: Números entre 1 e 50.");
            System.out.println("Difícil: Números entre 1 e 100.");

            String nivelDeDificuldade = scanner.next();

            int numeroSorteadoPorDificuldade = 0;

            if (nivelDeDificuldade.equals("Fácil")) {
                numeroSorteadoPorDificuldade = numeroSorteadoFacil;
                System.out.println("Digite um número de 1 a 10:");
            } else if (nivelDeDificuldade.equals("Médio")) {
                numeroSorteadoPorDificuldade = numeroSorteadoMedio;
                System.out.println("Digite um número de 1 a 50:");
            } else if (nivelDeDificuldade.equals("Difícil")) {
                numeroSorteadoPorDificuldade = numeroSorteadoDificil;
                System.out.println("Digite um número de 1 a 100:");
            }

            int palpiteUsuario = scanner.nextInt();

            if (numeroSorteadoPorDificuldade == palpiteUsuario) {
                numerosAcertados.add(palpiteUsuario);
                pontuacao += 10;
                System.out.println("Parabens você acertou! o número sorteado foi: " + numeroSorteadoPorDificuldade);
                System.out.println("Você ganhou 10 pontos!");
            } else if (Math.abs(numeroSorteadoPorDificuldade - palpiteUsuario) == 1) {
                numerosErrados.add(palpiteUsuario);
                pontuacao += 5;
                System.out.println("Quase lá! Você estava a 1 de distância do número sorteado.");
                System.out.println("Você ganhou 5 pontos");
            } else {
                numerosErrados.add(palpiteUsuario);
                System.out.println("Você errou o numero sorteado era: " + numeroSorteadoPorDificuldade);
            }

            System.out.println("Pontuação total: " + pontuacao);
            System.out.println("Deseja continuar jogando? S/N");
            String continuar = scanner.next();

            if (!continuar.equals("S")) {
                continuarJogando = false;
            }

        }

        System.out.println("Pontuação final: " + pontuacao);
        System.out.println("Números acertados: " + numerosAcertados);
        System.out.println("Números errados: " + numerosErrados);
        scanner.close();
    }
}
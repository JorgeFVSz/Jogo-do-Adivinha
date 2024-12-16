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

            int numeroSorteado = random.nextInt(10) + 1;
            System.out.println("Digite um número de 1 a 10:");
            int palpiteUsuario = scanner.nextInt();

            if (numeroSorteado == palpiteUsuario) {
                pontuacao += 10;
                System.out.println("Parabens você acertou! o número sorteado foi: " + numeroSorteado);
                System.out.println("Você ganhou 10 pontos!");
            } else if (Math.abs(numeroSorteado - palpiteUsuario) == 1) {
                System.out.println("Quase lá! Você estava a 1 de distância do número sorteado.");
                pontuacao += 5;
                System.out.println("Você ganhou 5 pontos");
            } else {
                System.out.println("Você errou o numero sorteado era: " + numeroSorteado);
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
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        int numeroSorteado = random.nextInt(10) + 1;
        System.out.println("Número sorteado: " + numeroSorteado);

        int palpiteUsuario = scanner.nextInt();

        if (numeroSorteado == palpiteUsuario) {
            pontuacao += 10;
            System.out.println("Parabens você acertou o numero éra " + numeroSorteado);
            System.out.println("Você ganhou 10 pontos!");
        } else if (Math.abs(numeroSorteado - palpiteUsuario) == 1) {
            System.out.println("Você chegou muito perto mas errou por um");
            pontuacao += 5;
            System.out.println("Você ganhou 5 pontos!");
        } else {
            System.out.println("Você errou o numero sorteado era: " + numeroSorteado);
        }

        System.out.println("Pontuação total: " + pontuacao);
        scanner.close();

    }
}
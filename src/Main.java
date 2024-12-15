import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int pontuacao = 0;

        int numeroSorteado = random.nextInt(10) + 1;
        System.out.println("Número sorteado: " + numeroSorteado);

    }
}
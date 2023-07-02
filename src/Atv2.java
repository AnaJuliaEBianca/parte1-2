import java.util.Scanner;

public class Atv2 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double resul,raio, pi=3.14;

        System.out.println("Digite o valor do raio: ");
        raio = ler.nextDouble();

        resul = pi* (raio*raio);

        System.out.println("O valor da área do círculo é "+resul);
    }
}

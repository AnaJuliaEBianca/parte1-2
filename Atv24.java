import java.util.Scanner;

public class Atv24 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num, resul, i;

        System.out.print("Digite um número para a tabuada: ");
        num = ler.nextInt();

        System.out.println("\nAbaixo a tabuada do " + num + ":");

        for (i = 1; i <= 10; i++) {

            resul = (num * i);

            System.out.println(num + " x " + i + " = " + resul);

        }
    }
}


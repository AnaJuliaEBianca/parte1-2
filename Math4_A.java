import java.util.Scanner;

public class Math4_A {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            double raio = 0, area = 0;

            System.out.println("Digite o raio do circulo: ");
            raio = ler.nextDouble();

            area = Math.PI * Math.pow (raio, 2);
            System.out.println("A área do circulo é de: " + area);
            System.out.println();

        }
    }

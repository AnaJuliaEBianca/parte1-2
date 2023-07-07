import java.util.Scanner;

    public class Math4_E {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            double area, base, alt;

            System.out.println("Digite a base do triângulo: ");
            base = ler.nextDouble();

            System.out.println("Digite a altura do triângulo: ");
            alt = ler.nextDouble();

            area = (base * alt) / 2;

            System.out.println("A área do triângulo é: " + area);

        }
    }

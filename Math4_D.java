import java.util.Scanner;
public class Math4_D {

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            double alt, per, base;

            System.out.println("Digite o valor da base do retângulo: ");
            base = ler.nextDouble();

            System.out.println("Digite o valor da altura do retângulo: ");
            alt = ler.nextDouble();

            per = 2 * (base + alt);

            System.out.println("O perímetro do retângulo é: " + per);

        }
    }


import java.util.Scanner;

public class Math4_B {

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            double raio = 0, circulo = 0;

            System.out.println("Digite o raio do círculo: ");
            raio = ler.nextDouble();

            circulo = (raio * 2) * Math.PI;

            System.out.println("A circunferência do círculo é: " + circulo);

        }
    }


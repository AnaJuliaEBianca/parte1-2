import java.util.Scanner;

public class Math4_C {

        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            double catt1, catt2, hipo;

            System.out.println("Digite o primeiro cateto: ");
            catt1 = ler.nextDouble();

            System.out.println("Digite o segundo cateto: ");
            catt2 = ler.nextDouble();

            hipo = Math.sqrt(Math.pow(catt1, 2) + Math.pow(catt2, 2));

            System.out.println("A hipotenusa do triângulo retângulo é: "+ hipo);
        }
    }


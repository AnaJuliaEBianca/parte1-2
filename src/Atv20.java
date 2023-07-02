import java.util.Scanner;


public class Atv20 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double lado, area;

        System.out.println("Digite o lado do quadrado: ");
        lado = ler.nextDouble();

        area = Math.pow(lado, 2);

        System.out.println("A área do quadrado é: " + area + "cm²");






    }
}
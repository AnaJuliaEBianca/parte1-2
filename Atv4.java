import java.util.Scanner;

public class Atv4 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double celsius, fahren;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = ler.nextDouble();

        fahren = (celsius*1.8)+32;

        System.out.println("A conversão de Celsius para Fahrenheit é "+fahren);


    }
}

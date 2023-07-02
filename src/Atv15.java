
import java.util.Scanner;

public class Atv15 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double altura, peso, imc;

        System.out.println("Digite sua altura: ");
        altura = ler.nextDouble();

        System.out.println("Digite seu peso: ");
        peso = ler.nextDouble();

        imc = (peso / (altura * altura));

        System.out.println("Seu IMC é: " + imc);


    }
}
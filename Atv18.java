import java.util.Scanner;

public class Atv18 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int ano, idade, data;

        System.out.println("\nInforme sua idade: ");
        idade = ler.nextInt();

        System.out.println("Informe o ano atual: ");
        ano = ler.nextInt();

        data = (ano - idade);

        System.out.println("\nSua ano de nascimento é: " + data);


    }
}
import java.util.Scanner;

public class atividade8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double nmr2;
        int nmr;

        System.out.println("Digite o seu número inteiro: ");
        nmr = ler.nextInt();

        System.out.println("Digite seu número decimal: ");
        nmr2 = ler.nextDouble();

        System.out.println("Seu número inteiro é "+nmr+ " e seu número decimal é " + nmr2);
    }}
import java.util.Scanner;

public class atividade10 {

    public static void main(String[] args) {

        int nmr1, nmr2, x=0;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        nmr1 = ler.nextInt();

        System.out.println("Digite outro número inteiro: ");
        nmr2 = ler.nextInt();

        x = nmr1;
        nmr1 = nmr2;
        nmr2 = x;

        System.out.println("Os novos numeros são: " + nmr1 + " e " + nmr2);
    }
}

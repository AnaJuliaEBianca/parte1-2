import java.util.Scanner;

public class Atv1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int nm1, nm2, resul;

        System.out.println("Digite um número inteiro: ");
        nm1 = ler.nextInt();

        System.out.println("Digite outro número inteiro: ");
        nm2 = ler.nextInt();

        resul = nm1 + nm2;

        System.out.println("O resultado é: "+resul);

    }
}

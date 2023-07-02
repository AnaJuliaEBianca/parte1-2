import java.util.Scanner;

public class Atv23 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Double num, raiz, poten, expo;

        System.out.println("Digite um número: ");
        num = ler.nextDouble();

        System.out.println("Digite um expoente: ");
        expo = ler.nextDouble();

        raiz = Math.sqrt(num);

        poten = Math.pow(num, expo);

        System.out.println("A raiz do número " + num + " é = " + raiz);
        System.out.println("O resultado da exponenciação de " + num + " pelo expoente digitado é = " + poten);




    }
}

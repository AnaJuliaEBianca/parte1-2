import java.util.Scanner;

public class Atv17 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double prod, vlParc;
        int parce;

        System.out.println("\nDigite o valor do produto: ");
        prod = ler.nextDouble();

        System.out.println("Digite a quantidade de parcelas: ");
        parce = ler.nextInt();

        vlParc = (prod / parce);

        System.out.println("O valor do produto é R$" + prod + ", dividido em " + parce + "x, fica R$" + vlParc + " por mês.");

    }
}

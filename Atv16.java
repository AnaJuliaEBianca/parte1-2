import java.util.Scanner;

public class Atv16 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double nvPreco, prod, desc, vlFinal;

        System.out.println("\nDigite o valor do produto: ");
        prod = ler.nextDouble();

        System.out.println("Digite o valor do desconto: ");
        desc = ler.nextDouble();

        nvPreco = ( desc * prod) / 100;
        vlFinal = (prod - nvPreco);

        System.out.println("\n=================================================\n");

        System.out.println("O valor do produto era: R$" + prod + ", e o desconto de: " + desc +"%. O desconto foi de: R$" + nvPreco + ";");
        System.out.println("O valor final do produto com o desconto foi: R$" + vlFinal + ";");
    }
}
import java.util.Scanner;

public class Atv13 {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double valor,total;
        int quant;

        System.out.println("Digite o valor do produto: ");
        valor = ler.nextDouble();

        System.out.println("Digite a quantidade comprada: ");
        quant = ler.nextInt();

        total = valor*quant;

        System.out.println("O valor total da compra é de "+ total);

    }
}

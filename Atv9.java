import java.util.Scanner;

public class Atv9 {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int litro;
        Double valor, total;

        System.out.println("Digite a quantidade de litros abastecidos:");
        litro = ler.nextInt();

        System.out.println("Digite o valor do litro: ");
        valor = ler.nextDouble();

        total = litro*valor;

        System.out.println("O valor total a ser pago é "+total);

    }
}

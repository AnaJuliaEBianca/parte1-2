import java.util.Scanner;

public class Atv25 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Double dolar, total;

        System.out.println("Digite a quantidade em dolar: ");
        dolar = ler.nextDouble();

        total = (dolar * 4.79);

        System.out.println("$" + dolar + " convertido em real é R$" + total);



    }
}

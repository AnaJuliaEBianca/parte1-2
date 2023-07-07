import java.util.Scanner;

public class Atv12 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double valor,valordesconto,total;

        System.out.println("Digite o valor do produto: ");
        valor = ler.nextDouble();

        valordesconto = (15*valor)/100;
        total = (valor + valordesconto);

        System.out.println("preço do produto com acréscimo é de "+total);

    }
}

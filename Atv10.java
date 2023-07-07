import java.util.Scanner;

public class Atv10 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int dias;
        Double total,valor;

        System.out.println("Digite a quantidade de dias em que o carro foi alugado: ");
        dias = ler.nextInt();

        System.out.println("Digite o valor da diária: ");
        valor = ler.nextDouble();

        total = dias*valor;

        System.out.println("O valor total do aluguel é "+total);
    }
}

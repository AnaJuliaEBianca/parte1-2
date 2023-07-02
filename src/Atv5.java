import java.util.Scanner;

public class Atv5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double total,valor;
        int horas;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = ler.nextInt();

        System.out.println("Digite o valor da sua hora de trabalho: ");
        valor = ler.nextDouble();

        total = horas*valor;

        System.out.println("O sálario diário ganho é "+total);
    }
}

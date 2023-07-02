import java.util.Scanner;

public class Atv8 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Double valor,valordesc,total;

        System.out.println("Digite o valor do produto: ");
        valor = ler.nextDouble();

        valordesc = (10*valor)/100;
        total = (valor - valordesc);

        System.out.println("preço do produto com desconto é de "+total);



    }

}

import java.util.Scanner;

public class Math5 {
    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            double hipote = 0, ldOpos = 0, ldAdja = 0;

            System.out.println("Digite o valor da Hipotenusa:");
            hipote = ler.nextDouble();

            System.out.println("Digite o valor do Lado Oposto:");
            ldOpos = ler.nextDouble();

            ldAdja = Math.sqrt(Math.pow(hipote, 2) - Math.pow(ldOpos, 2));

            System.out.println("O valor do lado Adjacente é de: " + ldAdja);

        }
    }

import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {

        String cidade, nome;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.println("Digite sua cidade: ");
        cidade = ler.nextLine();

        System.out.println("Olá, " + nome + " você mora na cidade de " + cidade);



    }
}
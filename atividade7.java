import java.util.Scanner;

public class atividade7 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome, cidade;
        int nmr;

        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine();

        System.out.println("Digite sua idade: ");
        nmr = ler.nextInt();

        System.out.println("Digite sua cidade: ");
        cidade = ler.next();

        System.out.println("Seu nome é "+ nome+ " sua idade é " + nmr+ " e você mora em " + cidade);
    }}
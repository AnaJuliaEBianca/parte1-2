import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Double totalSegun, totalMin, totalHora, totalDia, dia, hora, min, segun;


        System.out.print("Digite a quantidade de dias: ");
        dia = ler.nextDouble();

        System.out.print("Digite a quantidade de horas: ");
        hora = ler.nextDouble();

        System.out.print("Digite a quantidade de minutos: ");
        min = ler.nextDouble();

        System.out.print("Digite a quantidade de segundos: ");
        segun = ler.nextDouble();


        totalDia = (dia * 24 * 60 * 60);
        totalHora = (hora * 60 * 60);
        totalMin = (min * 60);


        totalSegun = (totalDia + totalHora + totalMin + segun);

        System.out.println("\nO valor total de segundos é: " + totalSegun);

    }
}


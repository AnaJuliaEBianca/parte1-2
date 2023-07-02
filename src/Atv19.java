import java.util.Scanner;

public class Atv19 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int idade, mes, qntDia, qntMes;

        System.out.println("\nInforme sua idade para o cálculo: ");
        idade = ler.nextInt();

        qntMes = ( idade * 12);
        qntDia = ( idade * 365);

        System.out.println("A quantidade aproximada de meses vividos é de: " + qntMes);
        System.out.println("A quantidade aproximada de dias vividos é de: " + qntDia);



}
}


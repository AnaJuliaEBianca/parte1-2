import java.util.Scanner;

public class Math3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num = 0;
        double radiano, tanAng, arcoSeno, arcoCosse, arcoTang, logNatu;

        System.out.println("Digite um número: ");
        num = ler.nextDouble();

        radiano = Math.toRadians(num);
        num = radiano;

        tanAng = Math.tan(num);

        arcoSeno = Math.asin(num);

        arcoCosse = Math.acos(num);

        arcoTang = Math.atan(num);

        logNatu = Math.log(num);

        System.out.println("A tangente de um ângulo em radianos é: " + tanAng);
        System.out.println("O arco do seno é: " + arcoSeno);
        System.out.println("O arco do cosseno é: " + arcoCosse);
        System.out.println("O arco da tangente é: " + arcoTang);
        System.out.println("O logaritmo natural é: " + logNatu);
    }
}

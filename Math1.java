import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {

            Scanner ler = new Scanner(System.in);

            double x1, x2, y1, y2, resulD, pt1, pt2;

            System.out.println("Digite o valor de X1: ");
            x1 = ler.nextDouble();

            System.out.println("Digite o valor de X2: ");
            x2 = ler.nextDouble();

            System.out.println("Digite o valor de Y1: ");
            y1 = ler.nextDouble();

            System.out.println("Digite o valor de Y2: ");
            y2 = ler.nextDouble();

            pt1 = Math.pow (x2 - x1, 2);
            pt2 = Math.pow (y2 - y1, 2);
            resulD = Math.sqrt (pt1 + pt2);

            System.out.println("O resultado é: D = " + resulD);
    }
}
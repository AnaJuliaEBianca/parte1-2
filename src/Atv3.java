import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int resul,base,altura;

        System.out.println("Digite o valor da base do triângulo: ");
        base = ler.nextInt();

        System.out.println("Digite a altura do triângulo: ");
        altura = ler.nextInt();

        resul = (base*altura)/2;

        System.out.println("A área do triângulo é de "+resul);



    }
}

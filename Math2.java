import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double numCima, num2Cima, numBaixo, num2Baixo, numAbso, num2Abso,  vlrMax, vlrMin, senoNum, senoNum2, cossenoNum, cossenoNum2;
        double num = 0, num2 = 0;

        System.out.println("Digite o primeiro número: ");
        num = ler.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = ler.nextDouble();


        numCima = Math.ceil(num);
        num2Cima = Math.ceil(num2);


        numBaixo = Math.floor(num);
        num2Baixo = Math.floor(num2);


        numAbso = Math.abs(num);
        num2Abso = Math.abs(num2);


        vlrMax = Math.max(num,num2);
        vlrMin = Math.min(num,num2);


         senoNum = Math.sin(num);
         senoNum2 = Math.sin(num2);


         cossenoNum = Math.cos(num);
         cossenoNum2 = Math.cos(num2);

        System.out.println("O número arredondado para cima é: "+ numCima + " e " + num2Cima);
        System.out.println("O número arredondado para baixo é: " + numBaixo + " e " + num2Baixo);
        System.out.println("O número aleatório entre 0 e 1: " + Math.random());
        System.out.println("O valor absoluto é: " + numAbso + " e " + num2Abso);
        System.out.println("O valor máximo entre dois números é: " + vlrMax );
        System.out.println("O valor mínimo entre dois números é: " + vlrMin );
        System.out.println("O seno de um ângulo em radianos é: " + senoNum + " e " + senoNum2);
        System.out.println("O cosseno de um ângulo em radianos é: " + cossenoNum + " e " + cossenoNum2);
    }
}

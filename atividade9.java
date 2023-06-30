import java.util.Scanner;

public class atividade9 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome,rua,cidade,estado;
        int numero,cep,cpf,telefone;

        System.out.println("Digite o seu nome: ");
        nome = ler.nextLine();

        System.out.println("Digite o nome da sua rua: ");
        rua = ler.next();

        System.out.println("Digite o número da sua casa: ");
        numero = ler.nextInt();

        System.out.println("Digite o seu CEP: ");
        cep = ler.nextInt();

        System.out.println("Digite a sua Cidade: ");
        cidade = ler.next();

        System.out.println("Digite o seu Estado: ");
        estado = ler.next();

        System.out.println("Digite o seu CPF: ");
        cpf = ler.nextInt();

        System.out.println("Digite o seu telefone: ");
        telefone = ler.nextInt();

        System.out.println("Nome.......:"+ nome);
        System.out.println("Endereço...:"+ rua+" Número: "+ numero+" CEP: "+cep);
        System.out.println("Cidade.....:"+cidade);
        System.out.println("Estado.....:"+estado);
        System.out.println("CPF........:"+ cpf);
        System.out.println("Tel.Celular:"+telefone);
    }}

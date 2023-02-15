package ex2;
import java.util.Scanner;

public class Cadastro {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        

        System.out.println("Digite o seu nome: ");
        pessoa.nome= sc.next();

        System.out.println("Digite a sua idade:");
        pessoa.idade= sc.next();

        System.out.println("Digite quantos km vc andou hj: ");
        pessoa.andar= sc.nextFloat();

        pessoa.impressao();

    }
    
}

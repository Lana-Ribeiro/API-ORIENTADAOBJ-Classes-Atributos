package ex4;
import java.util.Scanner;

public class CadastraPessoa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       

        System.out.println("Digite seu nome: ");
       String nome = sc.next();

       System.out.println("Digite sua idade: ");
       int idade = sc.nextInt();

       System.out.println("Digite seu endereço: ");
       String endereco = sc.next();

       Pessoa Joao = new Pessoa(nome, idade, endereco);

       System.out.println("Seu nome é: "+Joao.nome+ "\n idade: "+Joao.idade+ "\nendereço: "+Joao.endereco);

System.out.println();
       
       System.out.println("Digite seu nome: ");
         nome = sc.next();

       System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

       System.out.println("Digite seu endereço: ");
       endereco = sc.next();

       Pessoa Maria = new Pessoa(nome, idade, endereco);

       System.out.println("Seu nome é: "+Maria.nome+ "\nIdade: "+Maria.idade+ "\nendereço: "+Maria.endereco);


       
       


        
      


    }

}
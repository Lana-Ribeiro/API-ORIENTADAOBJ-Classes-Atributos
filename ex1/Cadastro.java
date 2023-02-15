package ex1;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Aluno aluno = new Aluno();
        

        System.out.println("Digite o nome do aluno:");
        aluno.nome= sc.next();

        System.out.println("Digite o RA do aluno:");
        aluno.ra= sc.next();

        System.out.println("Digite a nota de PI do aluno:");
        aluno.notaPi= sc.nextFloat();

        System.out.println("Digite a nota de Apresentação do aluno:");
        aluno.notaAp= sc.nextFloat();


        aluno.impressao();

    }
    
}

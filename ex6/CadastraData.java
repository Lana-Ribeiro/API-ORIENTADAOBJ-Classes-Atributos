package ex6;

import java.util.Scanner;

public class CadastraData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Data data = new Data();

        System.out.print("Digite o ano: ");
        data.ano = sc.nextInt();

        System.out.print("Digite o mes: ");
        data.mes = sc.nextByte();

        System.out.print("Digite o dia: ");
        data.dia = sc.nextByte();
        
        data.impressao();
        data.mostraAnoBi();a
    
    
    }
    
}

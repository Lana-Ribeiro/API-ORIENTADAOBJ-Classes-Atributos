package ex3;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String art = " ____                                                                                           __               __            \n" + 
        "/\\  _`\\   __         __    __                                                            __    /\\ \\             /\\ \\           \n"  +
        "\\ \\ \\/\\ \\/\\_\\  _ __ /\\_\\  /\\_\\     __          ___    ___    ___ ___         ___  __  __/\\_\\   \\_\\ \\     __     \\_\\ \\    ___   \n"  +
        " \\ \\ \\ \\ \\/\\ \\/\\`'__\\/\\ \\ \\/\\ \\  /'__`\\       /'___\\ / __`\\/' __` __`\\      /'___/\\ \\/\\ \\/\\ \\  /'_` \\  /'__`\\   /'_` \\  / __`\\ \n"  +
        "  \\ \\ \\_\\ \\ \\ \\ \\ \\/ \\ \\ \\ \\ \\ \\/\\ \\L\\.\\_    /\\ \\__//\\ \\L\\ /\\ \\/\\ \\/\\ \\    /\\ \\__\\ \\ \\_\\ \\ \\ \\/\\ \\L\\ \\/\\ \\L\\.\\_/\\ \\L\\ \\/\\ \\L\\ \\\n"  +
        "   \\ \\____/\\ \\_\\ \\_\\  \\ \\_\\_\\ \\ \\ \\__/.\\_\\   \\ \\____\\ \\____\\ \\_\\ \\_\\ \\_\\   \\ \\____\\ \\____/\\ \\_\\ \\___,_\\ \\__/.\\_\\ \\___,_\\ \\____/\n"  +
        "    \\/___/  \\/_/\\/_/   \\/_/\\ \\_\\ \\/__/\\/_/    \\/____/\\/___/ \\/_/\\/_/\\/_/    \\/____/\\/___/  \\/_/\\/__,_ /\\/__/\\/_/\\/__,_ /\\/___/ \n"  +
        "                          \\ \\____/                                                                                             \n"  +
        "                           \\/___/                                                                                              \n";
        Carro carro = new Carro();

        System.out.println(art);
        

        System.out.println("Digite a marca do seu carro: ");
        carro.marca= sc.next();

        System.out.println("Digite o modelo do seu carro: ");
        carro.modelo= sc.next();

        System.out.println("Digite o ano do seu carro: ");
        carro.ano= sc.next();
        
        System.out.println("Digite a cor do seu carro: ");
        carro.cor= sc.next();

        System.out.println("Digite a senha para ligar o carro: ");
        carro.tentativa= sc.nextFloat();

        carro.impressao();
        carro.onooff();

        System.out.println(art);

    }


}

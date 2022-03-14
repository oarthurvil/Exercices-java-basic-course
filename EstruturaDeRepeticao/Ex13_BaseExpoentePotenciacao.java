package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex13_BaseExpoentePotenciacao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base da potenciação:");
        int base = scan.nextInt();

        System.out.println("Digite o expoente da potenciação:");
        int expoente = scan.nextInt();

        int resultado = base;

        for (int i = 1; i < expoente; i++){
            resultado *= base;
        }

        System.out.println("A potenciação de " + base + " elevado a " + expoente + " é : " + resultado);

    }
}

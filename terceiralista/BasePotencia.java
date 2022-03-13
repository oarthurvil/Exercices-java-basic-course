package terceiralista;

import java.util.Scanner;

public class BasePotencia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = scan.nextInt();

        System.out.println("Digite o expoente");
        int expoente = scan.nextInt();

        int resultado = 1;

        for (int i = 0; i < expoente; i++){
            resultado *= base;
        }

        System.out.println("O resultado é " + resultado);
    }
}

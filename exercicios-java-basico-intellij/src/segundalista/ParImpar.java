package segundalista;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para saber se é par ou ímpar.");
        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }
    }
}

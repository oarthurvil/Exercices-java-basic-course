package terceiralista;

import java.util.Scanner;

public class QuantidadeParesImpares {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite um número inteiro:");
            int entrada = scan.nextInt();

            if(entrada % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("São " + pares + " números pares.");
        System.out.println("São " + impares + " números ímpares.");
    }
}

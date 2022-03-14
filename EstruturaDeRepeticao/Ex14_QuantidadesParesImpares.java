package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex14_QuantidadesParesImpares {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º número:");
            int num = scan.nextInt();

            if (num % 2 == 0){
                pares += 1;
            } else {
                impares += 1;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}

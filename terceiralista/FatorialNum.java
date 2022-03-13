package terceiralista;

import java.util.Scanner;

public class FatorialNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja o fatorial");
        int num = scan.nextInt();

        int fatorial = 1;

        for (int i = num; i > 0; i--){
            fatorial *= i;
        }

        System.out.println("Fatorial é " + fatorial);
    }
}

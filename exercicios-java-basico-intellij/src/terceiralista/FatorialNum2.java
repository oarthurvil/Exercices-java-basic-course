package terceiralista;

import java.util.Scanner;

public class FatorialNum2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja o fatorial");
        int num = scan.nextInt();

        System.out.println("Fatorial de " + num);
        System.out.print(num + "! = ");

        int fatorial = 1;
        for (int i = num; i > 0; i--){
            fatorial *= i;
            System.out.print(i + " . ");
        }

        System.out.print(" 1 = " + fatorial);
    }
}

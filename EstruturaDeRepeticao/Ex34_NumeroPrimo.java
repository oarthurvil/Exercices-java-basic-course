package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex34_NumeroPrimo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número para saber se é primo:");
        int num = scan.nextInt();

        boolean primo = true;


        for (int i=2; i<num; i++){
            if (num % i == 0){
                primo = false;
            }
        }

        if (primo){
            System.out.println("É um número primo.");
        } else {
            System.out.println("Não é um número primo.");
        }
    }
}

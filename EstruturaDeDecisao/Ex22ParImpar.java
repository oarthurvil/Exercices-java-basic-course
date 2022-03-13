package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex22ParImpar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("É um número par");
        } else {
            System.out.println("É um número ímpar");
        }
    }
}

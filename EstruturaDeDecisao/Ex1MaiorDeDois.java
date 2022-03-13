package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex1MaiorDeDois {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scan.nextInt();

        if(num1 > num2){
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }

    }
}

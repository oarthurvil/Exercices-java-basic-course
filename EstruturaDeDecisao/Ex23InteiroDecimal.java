package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex23InteiroDecimal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número");
        double num = scan.nextDouble();

        if(num % 1 == 0){
            System.out.println("É um número inteiro.");
        } else {
            System.out.println("É um número decimal.");
        }
    }
}

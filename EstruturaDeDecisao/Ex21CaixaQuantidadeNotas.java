package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex21CaixaQuantidadeNotas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do saque:");
        int saque = scan.nextInt();

        if(saque < 10 || saque > 600){
            System.out.println("O caixa não aceita esse valor.");
        } else {
            int notas100 = saque / 100;
            int notas50 = (saque - (notas100 * 100)) / 50;
            int notas10 = (saque - (notas100 * 100) - (notas50 * 50)) / 10;
            int notas5 = (saque - (notas100 * 100) - (notas50 * 50) - (notas10 * 10)) / 5;
            int notas1 = (saque - (notas100 * 100) - (notas50 * 50) - (notas10 * 10) - (notas5 * 5)) / 1;

            System.out.println("Notas de 100: " + notas100);
            System.out.println("Notas de 50: " + notas50);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 5: " + notas5);
            System.out.println("Notas de 1: " + notas1);


        }
    }
}

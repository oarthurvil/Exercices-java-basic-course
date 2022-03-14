package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex23_NumeroPrimoAteN {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número para saber se é primo:");
        int numeroEntrada = scan.nextInt();

        int numeroDivisoes = 0;

        for(int num = 2; num < numeroEntrada; num++){
            boolean primo = true;


            for (int i=2; i<num; i++){
                if (num % i == 0){
                    System.out.println(num + " Não é um número primo, pois é divisível por " + i);

                    numeroDivisoes += 1;
                    primo = false;
                }
            }

            if (primo){
                numeroDivisoes += 1;
                System.out.println(num + " É um número primo.");
            }
        }

        System.out.println("O total de divisões testadas: " + numeroDivisoes);

    }
}

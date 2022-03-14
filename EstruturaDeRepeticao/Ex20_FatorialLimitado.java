package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex20_FatorialLimitado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean continuarLoop = true;

        while (continuarLoop){
            System.out.println("Digite o número para fatorial, inteiro, positivo e menor que 16:");
            int num = scan.nextInt();

            if(num >= 16 || num < 1 || num % 1 != 0){
                System.out.println("Você digitou um fatorial que não é inteiro, positivo ou menor que 16:");

            } else {
                String saida = num + "!= ";
                int resultado = 1;

                for (int i = num; i >= 1; i--){
                    resultado *= i;

                    if (i > 1){
                        saida += i +".";
                    } else {
                        saida += i;
                    }
                }

                saida += " = " + resultado;

                System.out.println("Fatorial: " + saida);
            }
        }
    }
}

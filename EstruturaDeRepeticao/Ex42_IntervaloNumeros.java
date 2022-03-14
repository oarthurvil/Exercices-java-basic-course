package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex42_IntervaloNumeros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean continuarLoop = true;

        int intervalo0Ate25 = 0;
        int intervalo26Ate50 = 0;
        int intervalo51Ate75 = 0;
        int intervalo76Ate100 = 0;

        while (continuarLoop){
            System.out.println("Digite um número inteiro:");
            int num = scan.nextInt();

            if (num >= 0 && num <= 100){

                if (num >= 0 && num <= 25){
                    intervalo0Ate25 += 1;
                }
                if (num >= 26 && num <= 50){
                    intervalo26Ate50 += 1;
                }
                if (num >= 51 && num <= 75){
                    intervalo51Ate75 += 1;
                }
                if (num >= 76 && num <= 100){
                    intervalo76Ate100 += 1;
                }

            } else {
                continuarLoop = false;

                System.out.println("Saída...");
                System.out.println("Números no intervalo: [0-25]: " + intervalo0Ate25);
                System.out.println("Números no intervalo: [26-50]: " + intervalo26Ate50);
                System.out.println("Números no intervalo: [51-75]: " + intervalo51Ate75);
                System.out.println("Números no intervalo: [76-100]: " + intervalo76Ate100);

            }
        }
    }
}

package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex7_MaiorNumeroDe5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        double maiorNumero = -99999;

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número");
            double numero = scan.nextDouble();

            if (numero > maiorNumero){
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número digitado é: " + maiorNumero);
    }
}

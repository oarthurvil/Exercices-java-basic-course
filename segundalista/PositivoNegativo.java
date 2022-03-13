package segundalista;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = scan.nextDouble();

        if (numero == 0){
            System.out.println("O número é zero ");
        } else if(numero > 0){
            System.out.println("O número é positivo ");
        } else {
            System.out.println("O número é negativo ");
        }

        scan.close();
    }
}

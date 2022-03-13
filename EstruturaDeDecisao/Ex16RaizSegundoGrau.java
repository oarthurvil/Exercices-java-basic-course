package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex16RaizSegundoGrau {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A para equação de segundo grau");
        double valorA = scan.nextDouble();

        if (valorA == 0){
            System.out.println("O valor de A não pode ser igual a 0");
        } else {
            System.out.println("Digite o valor de B para equação de segundo grau");
            double valorB = scan.nextDouble();

            System.out.println("Digite o valor de C para equação de segundo grau");
            double valorC = scan.nextDouble();

            double valorDelta = (valorB * valorB) - (4 * (valorA) * (valorC));
            double valorRaizPositiva = ((-valorB) + Math.sqrt(valorDelta)) / (2 * valorA);
            double valorRaizNegativa = ((-valorB) - Math.sqrt(valorDelta)) / (2 * valorA);

            if (valorDelta < 0){
                System.out.println("O delta tem valor negativo e não possui raízes reais");
            } else if(valorDelta == 0) {
                System.out.println("O delta tem valor igual a 0 e possui 2 raízes iguais : " + valorRaizPositiva);
            } else {
                System.out.println("O delta tem valor positivo e possui 2 raízes:");
                System.out.println("Raíz 1: " + valorRaizPositiva);
                System.out.println("Raíz 2: " + valorRaizNegativa);
            }
        }
    }
}

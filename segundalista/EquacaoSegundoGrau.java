package segundalista;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os valores de a, b e c para calcular a equação de segundo grau.");

        System.out.println("Digite o valor de a:");
        double valorA = scan.nextDouble();

        if(valorA == 0){
            System.out.println("O valor não faz parte de uma equação de segundo grau.");
            System.exit(0);
        }

        System.out.println("Digite o valor de b:");
        double valorB = scan.nextDouble();

        System.out.println("Digite o valor de c:");
        double valorC = scan.nextDouble();

        double calcDelta = (valorB * valorB) - (4 * (valorA * (valorC)));

        if(calcDelta < 0){
            System.out.println("A equação não possui raízes reais.");

        } else if (calcDelta == 0){
            double calcRaizDelta0 = (-(valorB)) / (2 * valorA);
            System.out.println("Possui uma raíz real: " + calcRaizDelta0);

        } else {
            double calcRaiz1 = ((-(valorB)) + Math.sqrt(calcDelta)) / (2 * valorA);
            double calcRaiz2 = ((-(valorB)) - Math.sqrt(calcDelta)) / (2 * valorA);

            System.out.println("As raízes possíveis são: " + calcRaiz1 + " e "+ calcRaiz2);
        }

        scan.close();
    }
}

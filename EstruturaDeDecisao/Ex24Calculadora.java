package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex24Calculadora {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1º número:");
        double num1 = scan.nextDouble();


        System.out.println("Escolha uma operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtracao");
        System.out.println("3. Multiplicacao");
        System.out.println("4. Divisao");
        int operacao = scan.nextInt();

        System.out.println("Digite o 2º número:");
        double num2 = scan.nextDouble();

        double resultado = 0.0;

        switch (operacao){
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado : " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado : " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado : " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("Resultado : " + resultado);
                break;
            default: System.out.println("Operação informada não válida.");
        }

        if(resultado % 2 == 0){
            System.out.println("É um número par");
        } else {
            System.out.println("É um número ímpar");
        }

        if(resultado > 0){
            System.out.println("É um número positivo");
        } else {
            System.out.println("É um número negativo");
        }

        if(resultado % 1 == 0){
            System.out.println("É um número inteiro.");
        } else {
            System.out.println("É um número decimal.");
        }
    }
}

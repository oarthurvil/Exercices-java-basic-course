package ExerciciosClasses.Ex11_Calculadora;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true){
            System.out.println("Digite o primeiro número da operação:");
            double num1 = scanner.nextDouble();

            System.out.println("Digite qual operação deseja fazer:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("5 - Resto");
            int operacao = scanner.nextInt();

            System.out.println("Digite o segundo número da operação:");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (operacao){
                case 1:
                    resultado = calculadora.soma(num1, num2);
                    break;
                case 2:
                    resultado = calculadora.subtracao(num1, num2);
                    break;
                case 3:
                    resultado = calculadora.divisao(num1, num2);
                    break;
                case 4:
                    resultado = calculadora.multiplicacao(num1, num2);
                    break;
                case 5:
                    resultado = calculadora.resto(num1, num2);
                    break;
                default: System.out.println("Digite uma operação válida.");
            }

            System.out.println("O resultado da operação é: " + resultado);
        }
    }
}

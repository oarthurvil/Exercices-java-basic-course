package segundalista;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número.");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número.");
        int num2 = scan.nextInt();

        System.out.println("Escolha uma operação:");
        System.out.println("Para SOMA digite (SOM):");
        System.out.println("Para SUBTRAÇÃO digite (SUB):");
        System.out.println("Para MULTIPLICAÇÃO digite (MULT):");
        System.out.println("Para DIVISÃO digite (DIV):");
        String operacao = scan.next();
        String operacaoUpperCase = operacao.toUpperCase();

        int resultado = 0;

        switch (operacaoUpperCase){
            case "SOM": resultado = num1 + num2;break;
            case "SUB": resultado = num1 - num2;break;
            case "MULT": resultado = num1 * num2;break;
            case "DIV": resultado = num1 / num2;break;
            default: System.out.println("Digite uma operação válida.");
        }

        if(resultado % 2 == 0){
            System.out.println(resultado + " é par.");
        } else {
            System.out.println(resultado + " é ímpar.");
        }

        if (resultado > 0){
            System.out.println(resultado + " é positivo.");
        } else  {
            System.out.println(resultado + " é negativo.");
        }
    }
}

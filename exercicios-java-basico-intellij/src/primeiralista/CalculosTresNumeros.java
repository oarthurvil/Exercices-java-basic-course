package primeiralista;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculosTresNumeros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Digite um inteiro:");
        int primeiroNum = scan.nextInt();

        System.out.println("Digite o segundo inteiro:");
        int segundoNum = scan.nextInt();

        System.out.println("Digite um número real:");
        double terceiroNum = scan.nextDouble();

        double primeiraOperacao = (2 * primeiroNum) + (segundoNum / 2);
        System.out.println( "O dobro de " + primeiroNum + " mais metade de " + segundoNum + " = " + decimalFormat.format(primeiraOperacao));

        double segundaOperacao = (3 * primeiroNum) + terceiroNum;
        System.out.println( "O triplo de " + primeiroNum + " mais " + terceiroNum + " = " + segundaOperacao);

        double terceiraOperacao = Math.pow(terceiroNum, 3);
        System.out.println( "O" + terceiroNum + " elevado ao cubo " + " = " + decimalFormat.format(terceiraOperacao));


        scan.close();

    }
}

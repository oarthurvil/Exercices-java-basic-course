package segundalista;

import java.util.Scanner;

public class MaiorMenorTresNumeros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double primeiroNumero = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        double segundoNumero = scan.nextDouble();

        System.out.println("Digite o terceiro número:");
        double terceiroNumero = scan.nextDouble();


        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero){
            System.out.println("O maior número é: " + primeiroNumero);
        } else if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero){
            System.out.println("O maior número é: " + segundoNumero);
        } else {
            System.out.println("O maior número é: " + terceiroNumero);
        }

        if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero){
            System.out.println("O menor número é: " + primeiroNumero);
        } else if(segundoNumero < primeiroNumero && segundoNumero < terceiroNumero){
            System.out.println("O menor número é: " + segundoNumero);
        } else {
            System.out.println("O menor número é: " + terceiroNumero);
        }

        scan.close();
    }
}

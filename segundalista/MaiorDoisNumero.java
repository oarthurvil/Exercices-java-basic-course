package segundalista;

import java.util.Scanner;

public class MaiorDoisNumero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double primeiroNumero = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        double segundoNumero = scan.nextDouble();

        if(primeiroNumero > segundoNumero){
            System.out.println("O maior número é: " + primeiroNumero);
        } else {
            System.out.println("O maior número é: " + segundoNumero);
        }

        scan.close();
    }
}

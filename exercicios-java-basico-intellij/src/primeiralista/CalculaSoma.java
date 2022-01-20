package primeiralista;

import java.util.Scanner;

public class CalculaSoma {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Calcular a soma de dois números inteiros.");

        System.out.println("Digite o primeiro número: ");
        int primeiroNum = scan.nextInt();

        System.out.println("Digite o primeiro número: ");
        int segundoNum = scan.nextInt();

        int resultado = primeiroNum + segundoNum;

        System.out.println("A soma de " + primeiroNum + " + " + segundoNum + " = " + resultado);

        scan.close();
    }
}

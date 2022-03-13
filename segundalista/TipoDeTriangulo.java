package segundalista;

import java.util.Scanner;

public class TipoDeTriangulo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um lado do triângulo:");
        double lado1 = scan.nextDouble();

        System.out.println("Digite outro lado do triângulo:");
        double lado2 = scan.nextDouble();

        System.out.println("Digite o último lado do triângulo:");
        double lado3 = scan.nextDouble();

        double testeTriangulo = lado1 + lado2;

        if (testeTriangulo > lado3){
            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("É um triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("É um triângulo Isósceles");
            } else {
                System.out.println("É um triângulo Escaleno");
            }
        } else {
            System.out.println("Digite tamanhos válidos para um triângulo.");
        }
    }
}

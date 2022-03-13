package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex15LadosTriangulo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o 1º lado do triângulo");
        double lado1 = scan.nextDouble();

        System.out.println("Digite o 2º lado do triângulo");
        double lado2 = scan.nextDouble();

        System.out.println("Digite o 3º lado do triângulo");
        double lado3 = scan.nextDouble();

        if ((lado1 + lado2) < lado3) {
            System.out.println("As medidas não são de um triângulo");
        } else {
            if (lado1 == lado2 && lado1 == lado3){
                System.out.println("As medidas são de um triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("As medidas são de um triângulo Isósceles");
            } else {
                System.out.println("As medidas são de um triângulo Escaleno");
            }
        }


    }
}

package primeiralista;

import java.util.Scanner;

public class CalculaDobroAreaQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho de um dos lados do quadrado para calcular a área do mesmo.");
        double ladoQuadrado = scan.nextDouble();

        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println("A área do quadrado é: " + areaQuadrado);

        double areaQuadradoVezesDois = areaQuadrado * 2;
        System.out.println("A área do quadrado vezes dois é: " + areaQuadradoVezesDois);

        scan.close();
    }
}

package ExerciciosClasses.Ex2_Quadrado;

import java.util.Scanner;

public class TesteQuadrado {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(10);
        quadrado.retornarLado();
        System.out.println("Área do quadrado: " + quadrado.calcularAreaQuadrado());

        System.out.println("Digite o novo tamanho do quadrado:");
        double novoLadoQuadrado = scanner.nextDouble();

        quadrado.mudarLado(novoLadoQuadrado);
        quadrado.retornarLado();
        System.out.println("Área do quadrado: " + quadrado.calcularAreaQuadrado());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetroQuadrado());
    }
}

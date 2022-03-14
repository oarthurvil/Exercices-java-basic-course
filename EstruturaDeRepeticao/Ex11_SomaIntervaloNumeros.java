package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex11_SomaIntervaloNumeros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o inicio do intervalo:");
        double inicio = scan.nextDouble();

        System.out.println("Digite o fim do intervalo:");
        double fim = scan.nextDouble();

        double soma = 0;

        for(double i = (inicio + 1); i < fim; i++) {
            soma += i;
        }

        System.out.println("A soma do intervalo é " + soma);
    }
}

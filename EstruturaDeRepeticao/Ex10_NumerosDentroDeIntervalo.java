package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex10_NumerosDentroDeIntervalo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número inicial:");
        int numInicio = scan.nextInt();

        System.out.println("Digite o número final:");
        int numFinal = scan.nextInt();

        System.out.println("Número no intervalo:");

        for (int i = (numInicio + 1); i < numFinal; i++){
            System.out.println(i);
        }

    }
}

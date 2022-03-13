package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex20MediaNotas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a 1º nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a 2º nota:");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a 3º nota:");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media == 10){
            System.out.println("Aprovado com distinção, média : " + media);
        } else if (media >= 7){
            System.out.println("Aprovado, média : " + media);
        } else {
            System.out.println("Reprovado, média : " + media);
        }



    }
}

package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex14NotaAlunoConceito {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 9 && media <= 10){
            System.out.println("Média: " + media + " Conceito: A");
            System.out.println("APROVADO");
        } else if (media >= 7.5 && media < 9){
            System.out.println("Média: " + media + " Conceito: B");
            System.out.println("APROVADO");
        } else if (media >= 6 && media < 7.5){
            System.out.println("Média: " + media + " Conceito: C");
            System.out.println("APROVADO");
        } else if (media >= 4 && media < 6){
            System.out.println("Média: " + media + " Conceito: D");
            System.out.println("REPROVADO");
        } else {
            System.out.println("Média: " + media + " Conceito: E");
            System.out.println("REPROVADO");
        }

    }
}

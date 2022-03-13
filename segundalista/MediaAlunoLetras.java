package segundalista;

import java.util.Scanner;

public class MediaAlunoLetras {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        String situacao;
        String conceito;

        if (media > 9){
            situacao = "Aprovado";
            conceito = "A";
        } else if (media > 7.5 && media <= 9){
            situacao = "Aprovado";
            conceito = "B";
        } else if (media > 6 && media <= 7.5){
            situacao = "Aprovado";
            conceito = "C";
        } else if (media > 4 && media <= 6){
            situacao = "REPROVADO";
            conceito = "D";
        } else {
            situacao = "REPROVADO";
            conceito = "E";
        }

        System.out.println("Notas: " + nota1 + " e " + nota2);
        System.out.println("A média: " + media);
        System.out.println("O conceito: " + conceito);
        System.out.println("A situação: " + situacao);
    }
}

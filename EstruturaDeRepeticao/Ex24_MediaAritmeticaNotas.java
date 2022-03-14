package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex24_MediaAritmeticaNotas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas notas deseja inserir:");
        int qtdNotas = scan.nextInt();

        double totalNota = 0;

        for (int i = 1; i <= qtdNotas; i++){
            System.out.println("Digite a " + i + "ª nota:");
            double nota = scan.nextDouble();

            totalNota += nota;
        }

        double media = totalNota / qtdNotas;

        System.out.println("A média é: " + media);
    }
}

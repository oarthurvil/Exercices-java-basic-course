package terceiralista;

import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número de pessoas:");
        int pessoas = scan.nextInt();

        int soma = 0;
        double media;
        int idade;

        for (int i = 0; i < pessoas; i++){
            System.out.println("Entre com a idade da pessoa " + (i+1));
            idade = scan.nextInt();

            soma += idade;
        }

        media = soma / pessoas;

        if (media >= 0 && media <= 25){
            System.out.println("A turma é jovem.");
        } else if (media >= 26 && media < 60){
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }
    }
}

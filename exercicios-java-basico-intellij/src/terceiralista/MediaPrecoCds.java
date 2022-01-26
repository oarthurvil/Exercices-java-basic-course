package terceiralista;

import java.util.Scanner;

public class MediaPrecoCds {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número de CDs:");
        int quantidadeCds = scan.nextInt();

        int soma = 0;
        double media;
        double precoCd;

        for (int i = 0; i < quantidadeCds; i++){
            System.out.println("Entre com o preço do Cd " + (i+1));
            precoCd = scan.nextDouble();

            soma += precoCd;

        }

        media = soma / quantidadeCds;

        System.out.println("Soma total de CDs: " + soma);
        System.out.println("Média de valor por CD: " + media);
    }
}

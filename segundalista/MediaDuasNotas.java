package segundalista;

import java.util.Scanner;

public class MediaDuasNotas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma nota:");
        double primeiraNota = scan.nextDouble();

        System.out.println("Digite a outra nota:");
        double segundaNota = scan.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;


        if (media == 10){
            System.out.println("Aprovado com Distinção");
        } else if(media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scan.close();
    }
}

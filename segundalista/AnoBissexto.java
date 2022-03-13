package segundalista;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um ano para saber se ele é bissexto:");
        int ano = scan.nextInt();


        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("É um ano bissexto!");
        } else {
            System.out.println("NÃO é um ano bissexto!");
        }

    }
}

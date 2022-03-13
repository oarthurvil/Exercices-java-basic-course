package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex17AnoBissexto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano para saber se é bissexto:");
        int ano = scan.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0)){
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }
    }
}

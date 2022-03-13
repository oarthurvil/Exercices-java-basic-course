package terceiralista;

import java.util.Scanner;

public class InteirosEntreDoisNumerosSoma {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de partida:");
        int partida = scan.nextInt();

        System.out.println("Digite o número chegada:");
        int chegada = scan.nextInt();

        int soma = 0;

        for (int i = (partida + 1); i <= (chegada -1); i++){
            soma += i;
        }

        System.out.println("A soma dos números entre os valores é: " + soma);
    }
}

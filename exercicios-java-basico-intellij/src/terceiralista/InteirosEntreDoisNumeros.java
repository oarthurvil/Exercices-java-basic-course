package terceiralista;

import java.util.Scanner;

public class InteirosEntreDoisNumeros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de partida:");
        int partida = scan.nextInt();

        System.out.println("Digite o número chegada:");
        int chegada = scan.nextInt();

        for (int i = (partida + 1); i <= (chegada -1); i++){
            System.out.println(i);
        }

    }
}

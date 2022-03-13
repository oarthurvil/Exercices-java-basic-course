package terceiralista;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número para ver sua tabuada:");
        int numero = scan.nextInt();

        System.out.println("Tabuada de " + numero);
        for (int i = 1; i <= 10; i++){
            int resultadoTabuada = numero * i;

            System.out.println(numero + " x " + i + " = " + resultadoTabuada);
        }
    }
}

package terceiralista;

import java.util.Scanner;

public class MaiorNumeroDe5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];

        int maiorNumero = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero inteiro: ");
            int numero = scan.nextInt();
            numeros[i] = numero;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maiorNumero);


    }
}

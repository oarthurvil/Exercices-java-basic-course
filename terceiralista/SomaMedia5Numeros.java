package terceiralista;

import java.util.Scanner;

public class SomaMedia5Numeros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];

        int soma = 0;
        int media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero inteiro: ");
            int numero = scan.nextInt();
            numeros[i] = numero;
        }

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        media = soma / numeros.length;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
    }
}

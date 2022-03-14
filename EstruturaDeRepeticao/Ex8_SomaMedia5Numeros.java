package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex8_SomaMedia5Numeros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        double soma = 0;

        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + "º número");
            double numero = scan.nextDouble();

            soma += numero;
        }

        double media = soma / 5;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
    }
}

package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex18_MenorMaiorSoma {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos números deseja avaliar:");
        int quantidadeNumeros = scan.nextInt();

        int maior = -99999;
        int menor = 99999;
        int soma = 0;

        for (int i = 1; i <= quantidadeNumeros; i++){
            System.out.println("Digite o " + i + "º número:");
            int num = scan.nextInt();

            if (num > maior){
                maior = num;
            }

            if (num < menor){
                menor =num;
            }

            soma += num;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);

    }
}

package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex19_MaiorMenorSomaAte1000 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos números deseja avaliar:");
        int quantidadeNumeros = scan.nextInt();

        int maior = -999;
        int menor = 999;
        int soma = 0;

        for (int i = 1; i <= quantidadeNumeros; i++){
            System.out.println("Digite o " + i + "º número:");
            int num = scan.nextInt();

            if(num > 0 && num < 1000){
                if (num > maior){
                    maior = num;
                }

                if (num < menor){
                    menor =num;
                }

                soma += num;
            } else {
                System.out.println("O valor digitado tem que ser maior que 0 e menor que 1000");
                System.exit(0);
            }

        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);

    }
}

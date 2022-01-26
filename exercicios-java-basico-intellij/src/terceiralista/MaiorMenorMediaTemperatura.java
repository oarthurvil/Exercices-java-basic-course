package terceiralista;

import java.util.Scanner;

public class MaiorMenorMediaTemperatura {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantas temperaturas deseja inserir:");
        int quantidadeTemperaturas = scan.nextInt();

        double maiorTemperatura = Double.MAX_VALUE; // gerando valores errados
        double menortemperatura = Double.MIN_VALUE; // gerando valores errados
        double soma = 0;
        double temperatura;

        for (int i = 0; i < quantidadeTemperaturas; i++){
            System.out.println("Informe a temperatura " + (i + 1));
            temperatura = scan.nextDouble();

            soma += temperatura;

            if (temperatura > maiorTemperatura){
                maiorTemperatura = temperatura;
            }

            if (temperatura < menortemperatura){
                menortemperatura = temperatura;
            }
        }

        System.out.println("Média: " + (soma/quantidadeTemperaturas));
        System.out.println("Menor temperatura: " + menortemperatura);
        System.out.println("Maior temperatura: " + maiorTemperatura);
    }
}

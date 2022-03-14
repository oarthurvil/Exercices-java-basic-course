package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex33_MaiorMenorTemperaturaMedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double maior = -99999;
        double menor = 99999;
        double somaTemperaturas = 0;

        System.out.println("Digite quantas temperaturas serão inseridas:");
        int qtdTemperaturas = scanner.nextInt();

        for (int i = 1; i <= qtdTemperaturas; i++){
            System.out.println("Digite a " + i + " ª temperatura:");
            double temperatura = scanner.nextDouble();

            somaTemperaturas += temperatura;

            if (temperatura > maior){
                maior = temperatura;
            }
            if (temperatura < menor){
                menor = temperatura;
            }
        }

        double media = somaTemperaturas / qtdTemperaturas;

        System.out.println("A média das temperaturas é: " + media);
    }
}

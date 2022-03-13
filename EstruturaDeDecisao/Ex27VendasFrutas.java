package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex27VendasFrutas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos quilos de morango");
        double quilosMorangos = scan.nextDouble();

        System.out.println("Digite quantos quilos de maçã");
        double quilosMaca = scan.nextDouble();

        double totalQuilosFrutas = quilosMorangos + quilosMaca;

        double precoMorangoAte5kg = 2.50;
        double precoMorangoAcima5kg = 2.20;

        double precoMacaAte5kg = 1.80;
        double precoMacaAcima5kg = 1.50;

        double totalPagar = 0;

        if (quilosMorangos <= 5) {
            totalPagar += (quilosMorangos * precoMorangoAte5kg);
        } else {
            totalPagar += (quilosMorangos * precoMorangoAcima5kg);
        }

        if (quilosMaca <= 5) {
            totalPagar += (quilosMaca * precoMacaAte5kg);
        } else {
            totalPagar += (quilosMaca * precoMacaAcima5kg);
        }

        if (totalQuilosFrutas > 8 || totalPagar > 25){
            totalPagar -= (totalPagar * 0.10);
        }

        System.out.println("O valor total é: " + String.format("%.2f", totalPagar));
    }
}

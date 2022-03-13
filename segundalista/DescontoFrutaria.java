package segundalista;

import java.util.Scanner;

public class DescontoFrutaria {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de morangos em Kg:");
        double quilosMorango = scan.nextDouble();

        System.out.println("Digite a quantidade de maçãs em Kg:");
        double quilosMaca = scan.nextDouble();

        double precoMorango = 0;
        double precoMaca = 0;
        double quilosDeFrutas = quilosMorango + quilosMaca;
        double desconto = 0.10;

        if(quilosMorango <= 5){
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (quilosMaca <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double totalPagar = (precoMorango * quilosMorango) + (precoMaca * quilosMaca);

        if (totalPagar > 25 || quilosDeFrutas > 8){
            double totalPagarDesconto = totalPagar - (totalPagar * desconto);
            System.out.println("O total a pagar é: " + totalPagarDesconto);
        } else {
            System.out.println("O total a pagar é: " + totalPagar);
        }
    }
}

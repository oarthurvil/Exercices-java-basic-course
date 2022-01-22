package segundalista;

import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o combustível desejado (A) Álcool / (G) Gasolina");
        String tipoCombustivel = scan.next().toUpperCase();

        if(tipoCombustivel.equals("A") || tipoCombustivel.equals("G")){

            System.out.println("Digite quantos litros do combustível.");
            double litrosCombustivel = scan.nextDouble();

            double precoAlcool = 1.90;
            double precoGasolina = 2.50;
            double desconto = 0;
            double precoComDesconto = 0;
            double total;


            if (tipoCombustivel.equals("A")){

                if(litrosCombustivel <= 20){
                    desconto = precoAlcool * 0.03;
                } else {
                    desconto = precoAlcool * 0.05;
                }
                precoComDesconto = precoAlcool - desconto;

            } else if (tipoCombustivel.equals("G")){

                if(litrosCombustivel <= 20){
                    desconto = precoGasolina * 0.04;
                } else {
                    desconto = precoGasolina * 0.06;
                }
                precoComDesconto = precoGasolina - desconto;
            }

            total = litrosCombustivel * precoComDesconto;
            System.out.println("Total a pagar $ " + total + " por " + litrosCombustivel + "L");

        } else {
            System.out.println("Digite um combustível válido.");
        }
    }
}

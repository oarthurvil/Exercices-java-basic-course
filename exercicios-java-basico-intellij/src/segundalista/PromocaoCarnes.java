package segundalista;

import java.util.Scanner;

public class PromocaoCarnes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tipo de carne: \n (F) File Duplo \n (A) Alcatra \n (P) Picanha");
        String tipoCarne = scan.next().toUpperCase();

        if(tipoCarne.equals("F") || tipoCarne.equals("A") || tipoCarne.equals("P")){

            System.out.println("Informe a quantidade em Kg de carne:");
            double quantidadeCarne = scan.nextDouble();

            double precoQuilo = 0;
            double desconto = 0;

            if(tipoCarne.equals("F")){
                if(quantidadeCarne <= 5) {
                    precoQuilo = 4.90;
                } else {
                    precoQuilo = 5.80;
                }

            } else if(tipoCarne.equals("A")){
                if(quantidadeCarne <= 5) {
                    precoQuilo = 5.90;
                } else {
                    precoQuilo = 6.80;
                }

            } else if(tipoCarne.equals("P")){
                if(quantidadeCarne <= 5) {
                    precoQuilo = 6.90;
                } else {
                    precoQuilo = 7.80;
                }

            }

            System.out.println("Pagamento com cartão Tabajara? (S)/(N)");
            String usarCartao = scan.next().toUpperCase();

            double valorTotalCompra = quantidadeCarne * precoQuilo;

            if(usarCartao.equals("S") || usarCartao.equals("N")){
                if(usarCartao.equals("S")) {
                    desconto = 0.05;
                    valorTotalCompra = valorTotalCompra - (valorTotalCompra * desconto);
                    System.out.println("O total da sua compra é: " + " $ " + valorTotalCompra);
                } else {
                    desconto = 0;
                    System.out.println("O total da sua compra é: " + " $ " + valorTotalCompra);
                }
            } else {
                System.out.println("Digite uma opção válida para o cartão");
            }

        } else {
            System.out.println("Digite um tipo válido de carne");
        }

    }
}

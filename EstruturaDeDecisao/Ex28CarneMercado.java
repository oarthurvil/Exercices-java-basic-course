package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex28CarneMercado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tipo de carne:");
        System.out.println("1 - File Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipoCarne = scan.nextInt();

        double precoFileAte5kg = 4.90;
        double precoFileAcima5kg = 5.80;

        double precoAlcatraAte5kg = 5.90;
        double precoAlcatraAcima5kg = 6.80;

        double precoPicanhaAte5kg = 6.90;
        double precoPicanhaAcima5kg = 7.80;

        double valorPagar = 0.0;
        String nomeCarne = "";

        if (tipoCarne == 1 || tipoCarne == 2 || tipoCarne == 3){

            System.out.println("Digite quantos quilos:");
            double quilosCarne = scan.nextDouble();

            if (tipoCarne == 1){
                nomeCarne = "File Duplo";

                if (quilosCarne <= 5){
                    valorPagar = quilosCarne * precoFileAte5kg;
                } else {
                    valorPagar = quilosCarne * precoFileAcima5kg;
                }
            }

            if (tipoCarne == 2){
                nomeCarne = "Alcatra";

                if (quilosCarne <= 5){
                    valorPagar = quilosCarne * precoAlcatraAte5kg;
                } else {
                    valorPagar = quilosCarne * precoAlcatraAcima5kg;
                }
            }

            if (tipoCarne == 3){
                nomeCarne = "Picanha";

                if (quilosCarne <= 5){
                    valorPagar = quilosCarne * precoPicanhaAte5kg;
                } else {
                    valorPagar = quilosCarne * precoPicanhaAcima5kg;
                }
            }

            System.out.println("Digite o tipo de pagamento:");
            System.out.println("1 - Cartão Tabajara");
            System.out.println("2 - Dinheiro");
            int tipoPagamento = scan.nextInt();

            if (tipoPagamento == 1 || tipoPagamento == 2){
                String tipoPagamentoSaida;
                double valorDesconto = 0.0;
                double valorPagarFinal = 0.0;

                if (tipoPagamento == 1) {
                    tipoPagamentoSaida = "Cartão Tabajara";
                    valorDesconto = valorPagar * 0.05;
                    valorPagarFinal = valorPagar - valorDesconto;
                } else {
                    tipoPagamentoSaida = "Dinheiro";
                    valorDesconto *= valorPagar;
                    valorPagarFinal = valorPagar - valorDesconto;
                }

                System.out.println("Tipo de carne: " + nomeCarne);
                System.out.println("Quantidade de carne: " + quilosCarne + " Kg");
                System.out.println("Preco total: " + valorPagar);
                System.out.println("Tipo pagamento: " + tipoPagamentoSaida);
                System.out.println("Valor desconto: " + String.format("%.2f", valorDesconto));
                System.out.println("Valor final: " + valorPagarFinal);

            } else {
                System.out.println("Digite um tipo válido de pagamento.");
            }

        } else {
            System.out.println("Digite um tipo válido de carne.");
        }

    }
}

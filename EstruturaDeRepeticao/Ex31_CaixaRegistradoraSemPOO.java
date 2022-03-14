package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex31_CaixaRegistradoraSemPOO {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Lojas Tabajara");

            boolean continuarLoop = true;

            int numeroProduto = 1;
            double totalCompra = 0;

            while (continuarLoop){
                System.out.print("Produto " + numeroProduto + " : R$ ");
                double precoProduto = scanner.nextDouble();

                if (precoProduto > 0){
                    numeroProduto += 1;
                    totalCompra += precoProduto;

                } else {
                    continuarLoop = false;
                }
            }

            System.out.println("Total: R$ " + totalCompra);
            System.out.print("Dinheiro: R$ ");
            double dinheiroPago = scanner.nextDouble();
            System.out.println("Troco: R$ " + (dinheiroPago - totalCompra));
        }
    }
}

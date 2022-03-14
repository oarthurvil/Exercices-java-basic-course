package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex30_TabelaPaes1Ao50 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do Pão:");
        double valorProduto = scanner.nextDouble();

        System.out.println("Preço do Pão: R$ " + valorProduto);
        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i <= 50; i++){
            System.out.println(i + " - R$ " + String.format("%.2f",i * valorProduto));
        }
    }
}

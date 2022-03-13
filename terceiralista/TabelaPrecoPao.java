package terceiralista;

import java.util.Scanner;

public class TabelaPrecoPao {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do pão:");
        double preco = scan.nextDouble();

        System.out.println("Preço do pão: R$ " + preco);

        for (int i = 1; i <= 50; i++){
            double total = i * preco;
            System.out.println(i + " - " + "R$ " + total);
        }
    }
}

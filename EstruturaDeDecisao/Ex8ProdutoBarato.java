package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex8ProdutoBarato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro preço de produto:");
        double produto1 = scan.nextDouble();

        System.out.println("Digite o segundo preço de produto:");
        double produto2 = scan.nextDouble();

        System.out.println("Digite o terceiro preço de produto:");
        double produto3 = scan.nextDouble();


        //produto1 < produto2 < produto3
        //produto2 < produto1 < produto3
        //produto3 < produto2 < produto1
        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("O menor preço é o primeiro produto de preço:  " + produto1);
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("O menor preço é o segundo  produto de preço: " + produto2);
        } else {
            System.out.println("O menor preço é o terceiro produto de preço:  " + produto3);
        }
    }
}

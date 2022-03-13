package segundalista;

import java.util.Scanner;

public class MenorPreco {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro preço:");
        double prod1 = scan.nextDouble();

        System.out.println("Digite o segundo preço:");
        double prod2 = scan.nextDouble();

        System.out.println("Digite o terceiro preço:");
        double prod3 = scan.nextDouble();


        if (prod1 < prod2 && prod1 < prod3){
            System.out.println("O mais barato é: " + prod1);
        } else if(prod2 < prod1 && prod2 < prod3){
            System.out.println("O mais barato é: " + prod2);
        } else {
            System.out.println("O mais barato é: " + prod3);
        }

        scan.close();
    }
}

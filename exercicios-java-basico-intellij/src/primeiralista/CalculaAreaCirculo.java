package primeiralista;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaAreaCirculo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo em metros para calcular a área do mesmo.");
        double raioCirculo = scan.nextDouble();
        double areaCirculo = Math.PI * (raioCirculo * raioCirculo);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("A área do círculo é: " + decimalFormat.format(areaCirculo));

        scan.close();
    }
}

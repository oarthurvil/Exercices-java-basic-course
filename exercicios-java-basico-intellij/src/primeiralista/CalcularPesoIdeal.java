package primeiralista;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularPesoIdeal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        System.out.println("Digite sua altura em metros, separando com vírgula(EX. 1,60):");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Segundo a fórmula seu peso ideal é : " + decimalFormat.format(pesoIdeal) + " Kg.");

        scan.close();
    }
}

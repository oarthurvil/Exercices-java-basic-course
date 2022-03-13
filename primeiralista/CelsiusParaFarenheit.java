package primeiralista;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CelsiusParaFarenheit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite em graus Farenheit:");
        double grausCelsius = scan.nextDouble();

        double grausFarenheit = (grausCelsius / 1.8) + 32;

        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        System.out.println( grausCelsius + "ºC" + " são " + decimalFormat.format(grausFarenheit) + "ºF");

        scan.close();

    }
}

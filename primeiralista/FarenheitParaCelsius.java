package primeiralista;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FarenheitParaCelsius {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite em graus Farenheit:");
        double grausFarenheit = scan.nextDouble();

        double grausCelsius =  (grausFarenheit - 32) / 1.8;

        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        System.out.println( grausFarenheit + "ºF" + " são " + decimalFormat.format(grausCelsius) + "ºC");

        scan.close();

    }
}

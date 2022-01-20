package primeiralista;

import java.util.Scanner;

public class ConverteMetrosParaCentimetros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os metros que deseja converter para centímetros: ");
        double metros = scan.nextDouble();
        double centimetros = metros * 100;

        System.out.println(metros + " metros são " + centimetros + " centímetros");

        scan.close();
    }
}

package primeiralista;

import java.util.Scanner;

public class CalculaMediaNotas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Calcular a media das notas.");

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = scan.nextInt();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = scan.nextInt();

        System.out.println("Digite a terceira nota: ");
        double terceiraNota = scan.nextInt();

        System.out.println("Digite a quarta nota: ");
        double quartaNota = scan.nextInt();

        double resultado = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        System.out.println("A média das notas é " +  resultado);

        scan.close();
    }
}

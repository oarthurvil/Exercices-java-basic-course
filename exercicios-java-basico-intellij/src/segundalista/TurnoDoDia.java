package segundalista;

import java.util.Scanner;

public class TurnoDoDia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno do dia que Estuda (M)matutino (V)vespertino (N)noturno:");
        String letra = scan.next();
        String letraMaiuscula = letra.toUpperCase();

        switch (letraMaiuscula){
            case "M": System.out.println("Bom-dia!"); break;
            case "V": System.out.println("Boa tarde!"); break;
            case "N": System.out.println("Boa noite!"); break;
            default: System.out.println("Valor inválido!");
        }

        scan.close();
    }
}

package segundalista;

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra");
        String letra = scan.next();
        String letraMaiuscula = letra.toUpperCase();

       switch (letraMaiuscula){
           case "A": ;
           case "E": ;
           case "I": ;
           case "O": ;
           case "U": System.out.println("Vogal"); break;
           default: System.out.println("Consoante");
       }

        scan.close();
    }
}

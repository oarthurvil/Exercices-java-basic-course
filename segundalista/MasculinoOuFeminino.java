package segundalista;

import java.util.Scanner;

public class MasculinoOuFeminino {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra para masculino(M) ou feminino(F):");
        String letra = scan.next();
        String letraMaiuscula = letra.toUpperCase();
        String masculino = "M";
        String feminino = "F";

        if (letraMaiuscula.equals(masculino)){
            System.out.println("O sexo é Masculino");
        } else if(letraMaiuscula.equals(feminino)){
            System.out.println("O sexo é Feminino");
        } else {
            System.out.println("Essa entrada não é válida.");
        }

        scan.close();
    }
}

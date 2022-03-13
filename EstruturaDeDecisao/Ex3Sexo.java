package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex3Sexo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o sexo \nF - Feminino \nM - Masculino");
        String sexo = scan.next();

        if (sexo.equalsIgnoreCase("M")){
            System.out.println("Sexo masculino");
        } else if (sexo.equalsIgnoreCase("F")){
            System.out.println("Sexo feminino");
        } else {
            System.out.println("Sexo inválido");
        }


    }
}

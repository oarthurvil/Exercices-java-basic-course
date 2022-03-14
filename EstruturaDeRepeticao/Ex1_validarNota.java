package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex1_validarNota {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean continuarLoop = true;

        while (continuarLoop){
            System.out.println("Digite a nota:");
            double nota = scan.nextDouble();

            if (nota < 0 || nota > 10){
                System.out.println("Essa é uma nota inválida.");
            } else {
                System.out.println("A nota é: " + nota);
                continuarLoop = false;
            }
        }
    }
}

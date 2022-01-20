package primeiralista;

import java.util.Scanner;

public class NumeroDigitado {
    public static void main(String[] args){

        System.out.println("Informe um número!");
        Scanner scan = new Scanner(System.in);

        int numeroInformado = scan.nextInt();

        System.out.println("O número informado foi: " + numeroInformado);
        scan.close();
    }
}

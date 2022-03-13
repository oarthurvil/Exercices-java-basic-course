package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex18ValidarData {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia do mês:");
        int dia = scan.nextInt();

        if (dia > 31 || dia < 1){
            System.out.println("O dia digitado é inválido.");
        } else {
            System.out.println("Digite o número do mês. Ex. 1 (janeiro):");
            int mes = scan.nextInt();

            if (mes > 12 || mes < 1){
                System.out.println("O mês digitado é inválido.");
            } else {
                System.out.println("Digite o ano:");
                int ano = scan.nextInt();

                if(ano < 0){
                    System.out.println("O ano digitado é inválido.");
                } else {
                    System.out.println("A data é " + dia + " / " + mes + " / " + ano);
                }
            }
        }
    }
}

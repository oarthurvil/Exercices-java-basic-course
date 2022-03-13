package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex10TurnoEstudo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno: \nM-matutino \nV-Vespertino \nN- Noturno");
        String turno = scan.next();

        switch (turno.toUpperCase()){
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default: System.out.println("Valor inválido!");
        }
    }
}

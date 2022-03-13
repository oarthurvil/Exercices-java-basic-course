package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex19CentenasDezenasUnidades {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número, precisa ser menor que 1000:");
        int num = scan.nextInt();

        if(num > 1000){
            System.out.println("Número maior que mil.");
        } else {
            int centenas = num / 100;
            int dezenas = (num - (centenas * 100)) / 10;
            int unidades = num - (centenas * 100) - (dezenas * 10);

            System.out.println("Centenas: " + centenas);
            System.out.println("Dezenas: " + dezenas);
            System.out.println("Unidades: " + unidades);
        }
    }
}

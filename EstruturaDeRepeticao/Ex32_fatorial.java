package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex32_fatorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número para fazer seu fatorial:");
        int num = scan.nextInt();

        String saida = num + "!= ";
        int resultado = 1;

        for (int i = num; i >= 1; i--){
            resultado *= i;
            if (i > 1){
                saida += i +".";
            } else {
                saida += i;
            }

        }

        saida += " = " + resultado;

        System.out.println("Fatorial: " + saida);
    }
}

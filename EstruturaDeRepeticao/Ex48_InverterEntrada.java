package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex48_InverterEntrada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja inverter:");
        int num = scan.nextInt();

        String inverteNumero = Integer.toString(num);


        for (int i = inverteNumero.length() - 1; i >=0; i--){
            System.out.print(inverteNumero.charAt(i));
        }

        //System.out.println("O número: " + num + " invertido : " + new StringBuilder(inverteNumero).reverse());
    }
}

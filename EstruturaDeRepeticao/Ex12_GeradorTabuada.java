package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex12_GeradorTabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja ver a tabuada:");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num + " :" );

        for (int i = 1; i <= 10; i++){
            int tabuada = num * i;
            System.out.println(num + " x " + i + " = " + tabuada);
        }
    }
}

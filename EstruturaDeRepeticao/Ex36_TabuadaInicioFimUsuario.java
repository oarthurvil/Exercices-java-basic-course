package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex36_TabuadaInicioFimUsuario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja ver a tabuada:");
        int num = scan.nextInt();

        System.out.println("Digite o número que a tabuada começa:");
        int inicio = scan.nextInt();

        System.out.println("Digite o número que a tabuada termina:");
        int fim = scan.nextInt();

        if (inicio > fim) {
            System.out.println("O número de início deve ser menor que o final da tabuada.");
        } else {
            System.out.println("Tabuada de " + num + " :" );

            for (int i = inicio; i <= fim; i++){
                int tabuada = num * i;
                System.out.println(num + " x " + i + " = " + tabuada);
            }
        }
    }
}

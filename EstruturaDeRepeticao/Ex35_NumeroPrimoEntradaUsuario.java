package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex35_NumeroPrimoEntradaUsuario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número para saber se é primo:");
        int numeroEntrada = scan.nextInt();

        for(int num = 2; num < numeroEntrada; num++){
            boolean primo = true;

            for (int i=2; i<num; i++){
                if (num % i == 0){
                    primo = false;
                }
            }

            if (primo){
                System.out.println(num + " É um número primo.");
            }
        }
    }
}

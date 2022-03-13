package terceiralista;

import java.util.Scanner;

public class PedirNotaValida {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Digite uma nota entre 0 e 10");
            int nota = scan.nextInt();

            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Obrigado pela nota!");
            } else {
                notaValida = false;
                System.out.println("Você digitou uma nota fora de 0 e 10");
            }
        } while(!notaValida);
    }
}

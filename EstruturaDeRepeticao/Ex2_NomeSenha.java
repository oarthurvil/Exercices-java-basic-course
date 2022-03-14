package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex2_NomeSenha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean continuarLoop = true;

        while (continuarLoop){
            System.out.println("Digite o usuário:");
            String usuario = scan.next();

            System.out.println("Digite a senha:");
            String senha = scan.next();

            if (usuario.equalsIgnoreCase(senha)){
                System.out.println("O usuário e senha não podem ser iguais.");
            } else {
                System.out.println("O usuário e senha corretos.");
                continuarLoop = false;
            }

        }
    }
}

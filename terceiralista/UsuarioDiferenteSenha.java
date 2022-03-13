package terceiralista;

import java.util.Scanner;

public class UsuarioDiferenteSenha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean senhaValida = false;
        String usuario;
        String senha;

        do {
            System.out.println("Digite um usuário: ");
            usuario = scan.next();

            System.out.println("Digite uma senha");
            senha = scan.next();

            if (usuario.equalsIgnoreCase(senha)){
                senhaValida = false;
                System.out.println("O usuário e senha não podem ser iguais");
            } else {
                senhaValida = true;
                System.out.println("O usuário e senha aceitos");
            }
        } while (!senhaValida);

    }
}

package terceiralista;

import java.util.Scanner;

public class MediaAlunosTurma {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número de turmas:");
        int turmas = scan.nextInt();

        int soma = 0;
        double media;
        int turma;

        for (int i = 0; i < turmas; i++){
            System.out.println("Entre com a quantidade de alunos na turma " + (i+1));
            turma = scan.nextInt();

            if (turma > 40 ){
                System.out.println("Este número de alunos é inválido.");
                System.exit(0);
            } else {
                soma += turma;
            }
        }

        media = soma / turmas;

        System.out.println("Soma total de alunos: " + soma);
        System.out.println("Média de alunos por turma: " + media);
    }
}

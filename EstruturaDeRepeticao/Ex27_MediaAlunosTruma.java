package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex27_MediaAlunosTruma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de turmas:");
        int qtdTurmas = scanner.nextInt();

        int totalAlunos = 0;

        for (int i = 1; i <= qtdTurmas; i++){
            System.out.println("Digite quantos alunos tem a turma " + i);
            int numAlunos = scanner.nextInt();

            if ( numAlunos > 40){
                System.out.println("A turma não comporta mais de 40 alunos");
                System.exit(0);
            } else {
                totalAlunos += numAlunos;
            }
        }

        double media = totalAlunos / qtdTurmas;

        System.out.println("O número médio de alunos por turma é " + media);
    }
}

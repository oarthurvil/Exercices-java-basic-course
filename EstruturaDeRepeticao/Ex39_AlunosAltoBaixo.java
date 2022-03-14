package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex39_AlunosAltoBaixo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numeroAlunoAlto = 0;
        int maisAlto = 1;

        int numeroAlunoBaixo = 0;
        int maisBaixo = 99999;


        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o número do " + i + "º aluno:");
            int numAluno = scanner.nextInt();

            System.out.println("Digite a altura desse aluno:");
            int altura = scanner.nextInt();

            if(altura > maisAlto){
                numeroAlunoAlto = numAluno;
                maisAlto = altura;
            }
            if(altura < maisBaixo){
                numeroAlunoBaixo = numAluno;
                maisBaixo = altura;
            }
        }

        System.out.println("O aluno de nº " + numeroAlunoAlto + " é o mais alto, com " + maisAlto + " cm.");
        System.out.println("O aluno de nº " + numeroAlunoBaixo + " é o mais baixo, com " + maisBaixo+ " cm.");
    }
}

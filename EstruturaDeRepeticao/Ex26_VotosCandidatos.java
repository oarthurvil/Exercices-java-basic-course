package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex26_VotosCandidatos {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de eleitores:");
        int eleitores = scanner.nextInt();

        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;

        for (int i = 1; i <= eleitores; i++){
            System.out.println("O eleitor " + i + " vota em qual candidato?");
            System.out.println("1 - candidato1");
            System.out.println("2 - candidato2");
            System.out.println("3 - candidato3");
            int candidatoSelecionado = scanner.nextInt();

            switch (candidatoSelecionado){
                case 1:
                    candidato1 += 1;
                    break;
                case 2:
                    candidato2 += 1;
                    break;
                case 3:
                    candidato3 += 1;
                    break;
                default: System.out.println("Candidato inválido");
            }
        }

        System.out.println("O Candidato 1 tem: " + candidato1 + " votos.");
        System.out.println("O Candidato 2 tem: " + candidato2 + " votos.");
        System.out.println("O Candidato 3 tem: " + candidato3 + " votos.");

    }
}

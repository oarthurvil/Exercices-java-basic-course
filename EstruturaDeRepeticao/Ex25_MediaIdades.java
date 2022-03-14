package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex25_MediaIdades {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantas pessoas vão participar da média de idades:");
        int qtdPessoas = scan.nextInt();

        int totalIdade = 0;

        for (int i = 1; i <= qtdPessoas; i++){
            System.out.println("Qual a idade da " + i + " ª pessoa?");
            int idade = scan.nextInt();

            totalIdade += idade;
        }

        double mediaIdade = totalIdade / qtdPessoas;

        if (mediaIdade > 0 && mediaIdade <= 25){
            System.out.println("Média de jovens");
        } else if (mediaIdade >= 26 && mediaIdade <= 60){
            System.out.println("Média de adultos");
        } else {
            System.out.println("Média de idosos");
        }
    }
}

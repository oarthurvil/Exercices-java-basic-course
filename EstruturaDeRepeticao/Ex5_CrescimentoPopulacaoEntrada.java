package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex5_CrescimentoPopulacaoEntrada {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println("Digite a população do país A");
            double populacaoA = scan.nextDouble();

            System.out.println("Digite a taxa de crescimento da população do país A");
            double taxaCrescimentoPopulacaoA = scan.nextDouble();

            if (populacaoA > 0 && taxaCrescimentoPopulacaoA > 0){

                System.out.println("Digite a população de do país B");
                double populacaoB = scan.nextDouble();

                System.out.println("Digite a taxa de crescimento da população do país B");
                double taxaCrescimentoPopulacaoB = scan.nextDouble();

                if (populacaoB > 0 && taxaCrescimentoPopulacaoB > 0){

                    int anosNecessarios = 0;

                    boolean continuarLoop = true;

                    while (continuarLoop){
                        populacaoA += populacaoA * (taxaCrescimentoPopulacaoA / 100);
                        populacaoB += populacaoB * (taxaCrescimentoPopulacaoB / 100);
                        anosNecessarios += 1;

                        if (populacaoA >= populacaoB){
                            continuarLoop = false;
                            System.out.println("Será necessário: " + anosNecessarios + " anos.");
                        }
                    }
                } else {
                    System.out.println("PopulaçãoB ou taxaB digitadas inválidas.");
                }
            } else {
                System.out.println("PopulaçãoA ou taxaA digitadas inválidas.");
            }
        }
    }
}

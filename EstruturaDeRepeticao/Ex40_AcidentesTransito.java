package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex40_AcidentesTransito {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int codigoCidadeMaiorIndiceAcidentes = 0;
        int maiorIndiceAcidentes = 0;

        int codigoCidadeMenorIndiceAcidentes = 0;
        int menorIndiceAcidentes = 99999;

        int totalVeiculosTodasCidades = 0;

        int totalAcidentesCidadesMenos2000Veiculos = 0;
        int totalCidadesMenos2000Veiculos = 0;

        for (int i = 1; i <= 5; i++){
            System.out.println("Digite o código da " + i + "º cidade:");
            int codigo = scanner.nextInt();

            System.out.println("Digite o número de veículos de passeio da " + i + "º cidade:");
            int numVeiculos = scanner.nextInt();

            System.out.println("Digite o número de acidentes de trânsito com vítimas na " + i + "º cidade:");
            int numAcidentes = scanner.nextInt();

            totalVeiculosTodasCidades += numVeiculos;

            if(numAcidentes > maiorIndiceAcidentes){
                codigoCidadeMaiorIndiceAcidentes = codigo;
                maiorIndiceAcidentes = numAcidentes;
            }

            if(numAcidentes < menorIndiceAcidentes){
                codigoCidadeMenorIndiceAcidentes = codigo;
                menorIndiceAcidentes = numAcidentes;
            }

            if (numVeiculos < 2000){
                totalAcidentesCidadesMenos2000Veiculos += numAcidentes;
                totalCidadesMenos2000Veiculos += 1;
            }
        }

        double mediaVeiculosTodasCidades = totalVeiculosTodasCidades / 5;
        double mediaAcidentesCidadesMenos2000Veiculos = totalAcidentesCidadesMenos2000Veiculos / totalCidadesMenos2000Veiculos;

        System.out.println("Maior índice de acidentes código " +
                codigoCidadeMaiorIndiceAcidentes +
                " com " + maiorIndiceAcidentes +
                " acidentes.");

        System.out.println("Menor índice de acidentes código " +
                codigoCidadeMenorIndiceAcidentes +
                " com " + menorIndiceAcidentes +
                " acidentes.");

        System.out.println("A média de veículos nas cinco cidades juntas: " + mediaVeiculosTodasCidades);
        System.out.println("A média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + mediaAcidentesCidadesMenos2000Veiculos);
    }
}

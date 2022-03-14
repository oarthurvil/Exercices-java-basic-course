package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex28_ColecaoCDValorMedio {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quantos CDs a coleção possui:");
        int qtdDiscos = scanner.nextInt();

        int valorTotal = 0;

        for (int i = 1; i <= qtdDiscos; i++){
            System.out.println("Digite o valor do CD " + i);
            int valorCadaDisco = scanner.nextInt();

            valorTotal += valorCadaDisco;
        }

        int mediaValorCadaDisco = valorTotal / qtdDiscos;

        System.out.println("A coleção de CDs vale " + valorTotal);
        System.out.println("A média gasta em cada CD da coleção foi " + mediaValorCadaDisco);

    }
}

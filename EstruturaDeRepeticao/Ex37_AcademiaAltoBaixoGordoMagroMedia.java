package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex37_AcademiaAltoBaixoGordoMagroMedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int codigoGordo = 0;
        double maisGordo = 1;

        int codigoMagro = 0;
        double maisMagro = 99999;

        int codigoAlto = 0;
        double maisAlto = 1;

        int codigoBaixo = 0;
        double maisBaixo = 99999;

        double somaPeso = 0;
        double somaAltura = 0;

        int qtdClientes = 0;

        boolean continuarLoop = true;

        while (continuarLoop){
            System.out.println("Digite o código do " + (qtdClientes + 1) + " º cliente.");
            int codigo = scanner.nextInt();

            if (codigo != 0){
                qtdClientes += 1;

                System.out.println("Digite o peso do " + (qtdClientes) + " º cliente.");
                double peso = scanner.nextDouble();

                somaPeso += peso;

                System.out.println("Digite a altura do " + (qtdClientes) + " º cliente.");
                double altura = scanner.nextDouble();

                somaAltura += altura;

                if (peso > maisGordo){
                    maisGordo = peso;
                    codigoGordo = codigo;
                }
                if (peso < maisMagro){
                    maisMagro = peso;
                    codigoMagro = codigo;
                }

                if (altura > maisAlto){
                    maisAlto = altura;
                    codigoAlto = codigo;
                }
                if (altura < maisBaixo){
                    maisBaixo = altura;
                    codigoBaixo = codigo;
                }

            } else {
                continuarLoop = false;

                double mediaPeso = somaPeso / qtdClientes;
                double mediaAltura = somaAltura / qtdClientes;

                System.out.println("Mais Gordo " + codigoGordo + " peso " + maisGordo);
                System.out.println("Mais Magro " + codigoMagro + " peso " + maisMagro);
                System.out.println("Mais Alto " + codigoAlto + " altura " + maisAlto);
                System.out.println("Mais Baixo " + codigoBaixo + " altura " + maisBaixo);
                System.out.println("Média Peso : " + mediaPeso);
                System.out.println("Média Altura : " + mediaAltura);
            }
        }
    }
}

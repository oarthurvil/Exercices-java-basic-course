package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex26PostoCombustivel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o combustível:");
        System.out.println("G - Gasolina");
        System.out.println("A - Álcool");
        String tipoCombustivel = scan.next();

        if (tipoCombustivel.equalsIgnoreCase("G") || tipoCombustivel.equalsIgnoreCase("A")){

            System.out.println("Digite quantos litros");
            int litrosCombustivel = scan.nextInt();

            double precoGasolina = 2.50;
            double descontoGasolinaAte20 = 4;
            double descontoGasolinaMaisDe20 = 6;

            double precoAlcool = 1.90;
            double descontoAlcoolAte20 = 3;
            double descontoAlcoolMaisDe20 = 5;

            double totalPagar = 0.0;
            String tipoCombustivelSaida;

            if (tipoCombustivel.equalsIgnoreCase("G")){
                tipoCombustivelSaida = "G - Gasolina";

                if(litrosCombustivel <= 20){
                    totalPagar = litrosCombustivel * (precoGasolina - (precoGasolina * (descontoGasolinaAte20 / 100)));
                } else {
                    totalPagar = litrosCombustivel * (precoGasolina - (precoGasolina * (descontoGasolinaMaisDe20 / 100)));
                }

            } else {
                tipoCombustivelSaida = "A - Álcool";

                if(litrosCombustivel <= 20){
                    totalPagar = litrosCombustivel * (precoAlcool - (precoAlcool * (descontoAlcoolAte20 / 100)));
                } else {
                    totalPagar = litrosCombustivel * (precoAlcool - (precoAlcool * (descontoAlcoolMaisDe20 / 100)));
                }
            }


            System.out.println("Tipo de combustível " + tipoCombustivelSaida);
            System.out.println("Total a pagar: " + totalPagar);

        } else {
            System.out.println("Digite um combustível válido.");
        }
    }
}

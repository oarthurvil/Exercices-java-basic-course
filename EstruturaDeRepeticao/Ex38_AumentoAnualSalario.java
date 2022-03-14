package EstruturaDeRepeticao;

public class Ex38_AumentoAnualSalario {
    public static void main(String[] args){

        double salarioInicio = 1000;
        double aumento = 0.015;
        double salarioAtual = 0;

        for (int i = 1996; i <= 1996; i++){
            salarioAtual = salarioInicio + (salarioInicio * aumento);
            aumento *= 2;
        }

        System.out.println("O salário atual é: R$" + salarioAtual);
        System.out.println("O aumento total foi de: " + ((aumento * 100) / 2) + " %");

    }
}

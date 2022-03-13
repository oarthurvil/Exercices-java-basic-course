package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex12FolhaPagamento {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da hora de trabalho:");
        double precohora = scan.nextDouble();

        System.out.println("Digite quantas horas de trabalho no mês:");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = precohora * horasTrabalhadas;

        double porcImpostoRenda = 0;
        double porcInss = 10;
        double porcFgts = 11;

        if(salarioBruto <= 900) {
            porcImpostoRenda = 0;
        } else if(salarioBruto <= 1500) {
            porcImpostoRenda = 5;
        } else if(salarioBruto <= 2500) {
            porcImpostoRenda = 10;
        } else {
            porcImpostoRenda = 20;
        }

        double valorImpostoRenda = salarioBruto * (porcImpostoRenda / 100);
        double valorInss = salarioBruto * (porcInss / 100);
        double valorFgts = salarioBruto * (porcFgts / 100);

        double totaldescontos = valorImpostoRenda + valorInss;
        double salarioLiquido = salarioBruto - totaldescontos;

        System.out.println("Imposto de renda " + porcImpostoRenda + "% = " + valorImpostoRenda);
        System.out.println("INSS " + porcInss + "% = " + valorInss);
        System.out.println("FGTS " + porcFgts + "% = " + valorFgts);
        System.out.println("Total de descontos " + totaldescontos);
        System.out.println("Salário Líquido " + salarioLiquido);

    }
}

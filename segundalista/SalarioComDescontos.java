package segundalista;

import java.util.Scanner;

public class SalarioComDescontos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da hora de trabalho:");
        double precoHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas o mês:");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = precoHora * horasTrabalhadas;
        double impostoRenda = 0;
        double inss = salarioBruto * 0.10;
        double fgts = salarioBruto * 0.11;


        if(salarioBruto <= 900){
            impostoRenda = salarioBruto * 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            impostoRenda = salarioBruto * 0.05;
        } else if(salarioBruto > 1500 && salarioBruto <= 2500){
            impostoRenda = salarioBruto * 0.10;
        } else {
            impostoRenda = salarioBruto * 0.20;
        }

        double descontos = impostoRenda + inss;
        double salarioComDescontos = salarioBruto - descontos;

        System.out.println("Salário bruto: " + "$ " + salarioBruto);
        System.out.println("Imposto de Renda: " + "$ " + impostoRenda);
        System.out.println("INSS: " + "$ " + inss);
        System.out.println("FGTS: " + "$ " + fgts);
        System.out.println("Total de descontos: " + "$ " + descontos);
        System.out.println("Salário liquido: " + "$ " + salarioComDescontos);



        scan.close();
    }
}

package primeiralista;

import java.util.Scanner;

public class CalculaSalarioComDescontos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora:");
        double salarioHora = scan.nextDouble();

        System.out.println("Digite quantas horas você trabalhou esse mês:");
        double horasTrabalhadas = scan.nextDouble();

        double salarioMes = salarioHora * horasTrabalhadas;
        System.out.println("Seu salário bruto esse mês é: " + salarioMes);

        double porcentImpostRenda = salarioMes * 0.11;
        System.out.println("Pagou: " + porcentImpostRenda + " de imposto de renda (11%).");

        double porcentInss = salarioMes * 0.08;
        System.out.println("Pagou: " + porcentInss + " ao INSS (8%).");

        double porcentSindicato = salarioMes * 0.05;
        System.out.println("Pagou: " + porcentSindicato + " ao Sindicato (5%).");

        double salarioLiquido = salarioMes - (porcentImpostRenda + porcentInss + porcentSindicato);
        System.out.println("Seu salário líquido esse mês é: " + salarioLiquido);

        scan.close();

    }
}

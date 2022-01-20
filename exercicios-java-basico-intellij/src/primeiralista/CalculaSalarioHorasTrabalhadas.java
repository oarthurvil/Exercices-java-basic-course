package primeiralista;

import java.util.Scanner;

public class CalculaSalarioHorasTrabalhadas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora:");
        double salarioHora = scan.nextDouble();

        System.out.println("Digite quantas horas você trabalhou esse mês:");
        double horasTrabalhadas = scan.nextDouble();

        double salarioMes = salarioHora * horasTrabalhadas;

        System.out.println("Seu salário esse mês é: " + salarioMes);

        scan.close();

    }
}

package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex11AumentoSalarioAjuste {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = scan.nextDouble();

        double perctAumento = 0;

        if(salario <= 280){
            perctAumento = 20;
        } else if (salario > 280 && salario <= 700){
            perctAumento = 15;
        } else if (salario > 700 && salario <= 1500){
            perctAumento = 10;
        } else if (salario > 1500){
            perctAumento = 5;
        }

        double valorAumento = (perctAumento / 100) * salario;
        double novoSalario = salario + valorAumento;

        System.out.println("o salário antes do reajuste: " + salario);
        System.out.println("o percentual de aumento aplicado: " + perctAumento + " %");
        System.out.println("o valor do aumento: " + valorAumento);
        System.out.println("o novo salário, após o aumento: " + novoSalario);
    }
}

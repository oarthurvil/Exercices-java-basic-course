package segundalista;

import java.util.Scanner;

public class AumentoSalarioPorcentagem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário:");
        double salario = scan.nextDouble();
        double novoSalario = 0;
        int reajuste = 0;

        if(salario <= 280){
            novoSalario = salario + (salario * 0.20);
            reajuste = 20;
        } else if (salario > 280 && salario <= 700){
            novoSalario = salario + (salario * 0.15);
            reajuste = 15;
        } else if (salario > 700 && salario <= 1500){
            novoSalario = salario + (salario * 0.10);
            reajuste = 10;
        } else if (salario > 1500){
            novoSalario = salario + (salario * 0.05);
            reajuste = 5;
        }

        System.out.println("O salário antes do reajuste era $ " + salario);
        System.out.println("O salário sofre um aumento de " + reajuste + "%");
        System.out.println("O salário aumentou em $ " + (novoSalario - salario));
        System.out.println("O novo salário é $ " + novoSalario);

    }
}

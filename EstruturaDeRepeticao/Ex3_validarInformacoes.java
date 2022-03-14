package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex3_validarInformacoes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean continuarLoop = true;

        while (continuarLoop){
            System.out.println("Digite o nome:");
            String nome = scan.next();

            if (nome.length() <= 3){
                System.out.println("Tamanho de nome inválido.");
            } else {
                System.out.println("Digite a idade:");
                int idade = scan.nextInt();

                if (idade < 0 || idade > 150){
                    System.out.println("Valor da idade inválido.");
                } else {
                    System.out.println("Digite o salario:");
                    double salario = scan.nextDouble();

                    if (salario <= 0){
                        System.out.println("Valor do salário inválido.");
                    } else {
                        System.out.println("Digite o sexo: \n(F)\n(M)");
                        String sexo = scan.next();

                        if (!(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M"))){
                            System.out.println("Sexo inválido");
                        } else {
                            System.out.println("Digite o estado civil: \n(S)\n(C)\n(V)\n(D)");
                            String estadoCivil = scan.next();

                            if (!(estadoCivil.equalsIgnoreCase("S") ||
                                    estadoCivil.equalsIgnoreCase("C") ||
                                    estadoCivil.equalsIgnoreCase("V") ||
                                    estadoCivil.equalsIgnoreCase("D"))){
                                System.out.println("Estado Civil inválido");
                            } else {
                                System.out.println("Nome: " + nome.toUpperCase());
                                System.out.println("Idade: " + idade);
                                System.out.println("Salário: " + salario);
                                System.out.println("Sexo: " + sexo.toUpperCase());
                                System.out.println("Estado Civil: " + estadoCivil.toUpperCase());

                                continuarLoop = false;
                            }

                        }
                    }
                }
            }
        }
    }
}

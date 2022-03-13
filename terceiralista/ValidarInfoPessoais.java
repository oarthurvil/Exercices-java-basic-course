package terceiralista;

import java.util.Scanner;

public class ValidarInfoPessoais {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean validNome = false;
        boolean validIdade = false;
        boolean validSalario = false;
        boolean validSexo = false;
        boolean validEstadoCivil = false;

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        // NOME
        do {
            System.out.println("Digite um nome: ");
            nome = scan.next();

            if (nome.length() <= 3){
                validNome = false;
                System.out.println("Digite um nome válido, maior que 3 letras");
            } else {
                validNome = true;
            }
        } while (!validNome);

        // IDADE
        do {
            System.out.println("Digite uma idade: ");
            idade = scan.nextInt();

            if (idade > 0 && idade < 150){
                validIdade = true;
            } else {
                validIdade = false;
                System.out.println("Digite uma idade válida, maior que 0 e menor que 150");
            }
        } while (!validIdade);

        // SALARIO
        do {
            System.out.println("Digite um salário: ");
            salario = scan.nextDouble();

            if (salario > 0){
                validSalario = true;
            } else {
                validSalario = false;
                System.out.println("Digite um salário válido");
            }
        } while (!validSalario);

        // SEXO
        do {
            System.out.println("Digite um sexo (M) masculino (F) feminino: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
                validSexo = true;
            } else {
                validSexo = false;
                System.out.println("Digite um sexo válido");
            }
        } while (!validSexo);

        // ESTADO CIVIL
        do {
            System.out.println("Digite um estado civil (S)solteiro (C)casado (V)viúvo (D)divorciado: ");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("S") || sexo.equalsIgnoreCase("C") ||
                estadoCivil.equalsIgnoreCase("V") || sexo.equalsIgnoreCase("D")){
                validEstadoCivil = true;
            } else {
                validEstadoCivil = false;
                System.out.println("Digite um estado civil válido");
            }
        } while (!validEstadoCivil);

        if(validNome && validIdade && validSalario && validSexo && validEstadoCivil){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Salário: " + salario);
            System.out.println("Sexo: " + sexo);
            System.out.println("Estado civil: " + estadoCivil);

        }

    }
}

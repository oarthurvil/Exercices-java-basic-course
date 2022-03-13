package EstruturaDeDecisao;

import java.util.Scanner;

public class Ex25PerguntasCrime {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int respostasPositivas = 0;

        System.out.println("Telefonou para a vítima? S/N");
        String perg1 = scan.next();

        if (perg1.equalsIgnoreCase("S") || perg1.equalsIgnoreCase("N")){
            if (perg1.equalsIgnoreCase("S")){
                respostasPositivas += 1;
            }

            System.out.println("Esteve no local do crime? S/N");
            String perg2 = scan.next();
            if (perg2.equalsIgnoreCase("S") || perg2.equalsIgnoreCase("N")) {
                if (perg2.equalsIgnoreCase("S")) {
                    respostasPositivas += 1;
                }

                System.out.println("Mora perto da vítima? S/N");
                String perg3 = scan.next();
                if (perg3.equalsIgnoreCase("S") || perg3.equalsIgnoreCase("N")) {
                    if (perg3.equalsIgnoreCase("S")) {
                        respostasPositivas += 1;
                    }

                    System.out.println("Devia para a vítima? S/N");
                    String perg4 = scan.next();
                    if (perg4.equalsIgnoreCase("S") || perg4.equalsIgnoreCase("N")) {
                        if (perg4.equalsIgnoreCase("S")) {
                            respostasPositivas += 1;
                        }


                        System.out.println("Já trabalhou com a vítima? S/N");
                        String perg5 = scan.next();
                        if (perg5.equalsIgnoreCase("S") || perg5.equalsIgnoreCase("N")) {
                            if (perg5.equalsIgnoreCase("S")) {
                                respostasPositivas += 1;
                            }


                        } else {
                            System.out.println("Resposta inválida!");
                            System.exit(0);
                        }

                    } else {
                        System.out.println("Resposta inválida!");
                        System.exit(0);
                    }

                } else {
                    System.out.println("Resposta inválida!");
                    System.exit(0);
                }
            } else {
                System.out.println("Resposta inválida!");
                System.exit(0);
            }
        } else {
            System.out.println("Resposta inválida!");
            System.exit(0);
        }

        if(respostasPositivas == 2){
            System.out.println("Pessoa Suspeita.");
        } else if(respostasPositivas == 3 || respostasPositivas == 4){
            System.out.println("Pessoa Cúmplice.");
        } else if(respostasPositivas == 5){
            System.out.println("Pessoa Assassino.");
        } else {
            System.out.println("Pessoa Inocente.");
        }
    }
}

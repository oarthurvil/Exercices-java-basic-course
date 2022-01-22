package segundalista;

import java.util.Scanner;

public class CentralDenuncia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? (S)/(N)");
        String quest1 = scan.next().toUpperCase();

        System.out.println("Esteve no local do crime? (S)/(N)");
        String quest2 = scan.next().toUpperCase();

        System.out.println("Mora perto da vítima? (S)/(N)");
        String quest3 = scan.next().toUpperCase();

        System.out.println("Devia para vítima? (S)/(N)");
        String quest4 = scan.next().toUpperCase();

        System.out.println("Já trabalhou com a vítima? (S)/(N)");
        String quest5 = scan.next().toUpperCase();

        int count = 0;

        if (quest1.equals("S")){
            count++;
        }

        if (quest2.equals("S")){
            count++;
        }

        if (quest3.equals("S")){
            count++;
        }

        if (quest4.equals("S")){
            count++;
        }

        if (quest5.equals("S")){
            count++;
        }

        if (count == 2){
            System.out.println("Suspeita");
        } else if (count == 3 || count == 4){
            System.out.println("Cúmplice");
        } else if (count == 5){
            System.out.println("Assassino");
        } else if (count == 0){
            System.out.println("Inocente");
        }

    }
}

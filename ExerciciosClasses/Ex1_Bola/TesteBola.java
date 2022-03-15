package ExerciciosClasses.Ex1_Bola;

import java.util.Scanner;

public class TesteBola {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Bola bola1 = new Bola();
        bola1.setCor("azul");
        bola1.setCircunferencia(15);
        bola1.setMaterial("Plástico");


        System.out.println("Cor: " + bola1.getCor());
        System.out.println("Circunferência: " + bola1.getCircunferencia());
        System.out.println("Material: " + bola1.getMaterial());

        System.out.println("Digite a nova cor:");
        String novaCor = scanner.next();

        bola1.trocaCor(novaCor);
        bola1.mostraCor();
    }
}

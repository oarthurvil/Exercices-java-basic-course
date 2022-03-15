package ExerciciosClasses.Ex4_Circulo;

public class CirculoTeste {
    public static void main(String[] args){

        Circulo circulo = new Circulo();
        circulo.setRaio(3);
        System.out.println("Área círculo: " + circulo.calcularAreaCirculo());
        System.out.println("Perímetro círculo: " + circulo.calcularPerimetroCirculo());
    }
}

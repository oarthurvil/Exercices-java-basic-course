package ExerciciosClasses.Ex3_Retangulo;

public class TesteRetangulo {
    public static void main(String[] args){

        Retangulo retangulo = new Retangulo();

        retangulo.setBase(7);
        retangulo.setAltura(3);
        retangulo.retornarValor();
        System.out.println("Área retângulo: " + retangulo.calcularAreaRetangulo());
        System.out.println("Perímetro retângulo: " + retangulo.calcularPerimetroRetangulo());

        retangulo.mudarValor(5, 8);
        retangulo.retornarValor();
        System.out.println("Área retângulo: " + retangulo.calcularAreaRetangulo());
        System.out.println("Perímetro retângulo: " + retangulo.calcularPerimetroRetangulo());
    }
}

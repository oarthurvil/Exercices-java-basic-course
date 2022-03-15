package ExerciciosClasses.Ex2_Quadrado;

public class Quadrado {

    // variáveis de instância
    private double lado;

    //get e set
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Métodos
    void mudarLado(double lado){
        this.setLado(lado);
    }
    void retornarLado(){
        this.getLado();
    }
    double calcularAreaQuadrado(){
        return this.lado * this.lado;
    }
    double calcularPerimetroQuadrado(){
        return 4 * this.lado;
    }
}

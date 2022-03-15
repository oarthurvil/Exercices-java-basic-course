package ExerciciosClasses.Ex4_Circulo;

public class Circulo {

    // Variáveis de instância
    private double raio;
    private double pi = 3.14;

    // get e set
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }


    // Métodos
    double calcularAreaCirculo(){
        return this.pi * (this.raio * this.raio);
    }

    double calcularPerimetroCirculo(){
        return (2 * this.pi) * this.raio;
    }
}

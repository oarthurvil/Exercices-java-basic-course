package ExerciciosClasses.Ex3_Retangulo;

public class Retangulo {

    // Variáveis de instância
    private double base;
    private double altura;

    //get e set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos
    void mudarValor( double base, double altura){
        this.setBase(base);
        this.setAltura(altura);
    }

    void  retornarValor(){
        System.out.println("Base: " + this.getBase());
        System.out.println("Altura: " + this.getAltura());
    }

    double calcularAreaRetangulo(){
        return this.base * this.altura;
    }

    double calcularPerimetroRetangulo(){
        return 2 * (this.base + this.altura);
    }

}

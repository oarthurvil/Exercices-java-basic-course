package ExerciciosClasses.Ex1_Bola;

public class Bola {

    private String cor;
    private double circunferencia;
    private String material;

    //getrs e setrs
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Métodos
    void trocaCor(String cor){
        this.setCor(cor);
    }

    void mostraCor(){
        System.out.println(this.getCor());
    }

}

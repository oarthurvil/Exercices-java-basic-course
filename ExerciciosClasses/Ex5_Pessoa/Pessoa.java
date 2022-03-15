package ExerciciosClasses.Ex5_Pessoa;

public class Pessoa {

    // Variáveis de instância
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos
    void envelhecer(int anos){
        if (this.idade < 21){
            double anosDouble = Double.valueOf(anos);
            setAltura(this.altura + (anosDouble * 0.5));
        }
        setIdade(this.idade + anos);
    }

    void engordar(double quilos){
        setPeso(this.peso + quilos);
    }

    void emagrecer(double quilos){
        setPeso((this.peso - quilos));
    }

    void crescer(double centimetros){
        setAltura(this.altura + centimetros);
    }
}

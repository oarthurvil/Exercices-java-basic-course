package ExerciciosClasses.Ex7_Televisor;

public class Televisor {

    //variáveis de instância
    private int numCanal = 1;
    private int volume = 20;

    //get e set
    public int getNumCanal() {
        return numCanal;
    }

    public void setNumCanal(int numCanal) {
        this.numCanal = numCanal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //Métodos
    void mudarCanal(int novoCanal){
        if (novoCanal >= 1 && novoCanal <= 400){
            this.setNumCanal(novoCanal);
        } else {
            System.out.println("Canal inválido.");
        }
    }


    void aumentarVolume(int adicionarVolume){
        if ((this.volume + adicionarVolume) <= 100){
            this.setVolume(this.volume + adicionarVolume);
        } else {
            System.out.println("Não é possível aumentar tudo isso de volume");
        }
    }

    void diminuirVolume(int diminuirVolume){
        if ((this.volume - diminuirVolume) >= 0){
            this.setVolume(this.volume - diminuirVolume);
        } else {
            System.out.println("Não é possível abaixar essa quantidade de volume");
        }
    }
}

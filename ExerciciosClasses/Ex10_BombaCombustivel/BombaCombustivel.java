package ExerciciosClasses.Ex10_BombaCombustivel;

public class BombaCombustivel {

    private String tipoCombustivel = "Gasolina";
    private double valorLitro = 3;
    private double qtdCombustivel = 100;

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(double qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    void abastecerPorValor(double valor){
        double litrosAbastecer = valor / this.valorLitro;

        if (litrosAbastecer <= this.qtdCombustivel){
           this.setQtdCombustivel(this.qtdCombustivel - litrosAbastecer);
            System.out.println("Litros abastecidos: " + litrosAbastecer);
        } else {
            System.out.println("Não há combustível suficiente para esse valor.");
        }

    }

    void abastecerPorLitro(double litros){
        if (litros <= qtdCombustivel){
            double precoAbastecer = litros * valorLitro;
            this.setQtdCombustivel(this.qtdCombustivel - litros);
            System.out.println("Preço do abastecimento: " + precoAbastecer);
        } else {
            System.out.println("Não há combustível suficiente.");
        }
    }

    void alterarValor(double novoValorLitro){
        this.setValorLitro(novoValorLitro);
    }

    void alterarCombustivel(String novoTipoCombustivel){
        this.setTipoCombustivel(novoTipoCombustivel);
    }

    void alterarQtdCombustivel(double novaQtdCombustivel){
        this.setQtdCombustivel(this.qtdCombustivel + novaQtdCombustivel);
    }
}

package ExerciciosClasses.Ex10_BombaCombustivel;

public class TesteBombaCombustivel {
    public static void main(String[] args) {

        BombaCombustivel bombaCombustivel = new BombaCombustivel();

        System.out.println("Tipo: " + bombaCombustivel.getTipoCombustivel());
        System.out.println("Valor: " + bombaCombustivel.getValorLitro());
        System.out.println("Quantidade na bomba: " + bombaCombustivel.getQtdCombustivel());

        bombaCombustivel.abastecerPorValor(3);
        System.out.println("Quantidade na bomba: " + bombaCombustivel.getQtdCombustivel());

        bombaCombustivel.abastecerPorLitro(2);
        System.out.println("Quantidade na bomba: " + bombaCombustivel.getQtdCombustivel());

        bombaCombustivel.alterarValor(2);
        System.out.println("Valor: " + bombaCombustivel.getValorLitro());

        bombaCombustivel.alterarCombustivel("Álcool");
        System.out.println("Tipo: " + bombaCombustivel.getTipoCombustivel());

        bombaCombustivel.alterarQtdCombustivel(15);
        System.out.println("Quantidade na bomba: " + bombaCombustivel.getQtdCombustivel());
    }
}

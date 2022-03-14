package EstruturaDeRepeticao;

public class Ex29_TabelaProdutos199 {
    public static void main(String[] args){

        double valorProduto = 1.99;

        System.out.println("Lojas Quase Dois - Tabela de preços");

        for (int i = 1; i <= 50; i++){
            System.out.println(i + " - R$ " + (i * valorProduto));
        }
    }
}

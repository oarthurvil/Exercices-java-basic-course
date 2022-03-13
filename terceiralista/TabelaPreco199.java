package terceiralista;

public class TabelaPreco199 {
    public static void main(String[] args){

        double preco = 1.99;

        for (int i = 1; i <= 50; i++){
            double total = i * preco;
            System.out.println(i + " - " + "R$ " + total);
        }
    }
}

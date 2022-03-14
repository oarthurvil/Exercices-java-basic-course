package EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex41_TabelaDividaJurosParcelas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da dívida:");
        double valorDivida = scan.nextInt();

        int parcelaUnica = 1;
        int valorJurosParcelaUnica = 0;

        int qtdParcelas = 3;
        double jurosMaisParcelas = 10;
        double valorDividaReajustado = 0;
        double valorJuros = 0;
        double valorDaParcela = 0;

        System.out.println("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas  | Valor da Parcela");
        System.out.println(valorDivida + " | " + valorJurosParcelaUnica + " | " + parcelaUnica + " | " + valorDivida);

        for (int i = 1; i <= 4; i++){
            valorJuros = valorDivida * (jurosMaisParcelas / 100);
            valorDividaReajustado = valorDivida + (valorDivida * (jurosMaisParcelas / 100));
            valorDaParcela = valorDividaReajustado / qtdParcelas;

            System.out.println(valorDividaReajustado + " | " + valorJuros + " | " + qtdParcelas + " | " + String.format("%.2f", valorDaParcela));

            qtdParcelas += 3;
            jurosMaisParcelas += 5;
        }

    }
}

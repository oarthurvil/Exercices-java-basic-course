package ExerciciosClasses.Ex6_ContaCorrente;

public class TesteContaCorrente {
    public static void main(String[] args) {

        ContaCorrente correntista = new ContaCorrente();
        correntista.setNomeCorrentista("Arthur");
        correntista.setNumConta(186);

        System.out.println("Nome: " +  correntista.getNomeCorrentista());
        System.out.println("Número conta: " + correntista.getNumConta());
        System.out.println("Saldo conta: " + correntista.getSaldo());

        correntista.alterarNome("Caroline");
        correntista.setSaldo(1600);

        System.out.println("Nome: " +  correntista.getNomeCorrentista());
        System.out.println("Número conta: " + correntista.getNumConta());
        System.out.println("Saldo conta: " + correntista.getSaldo());


    }
}

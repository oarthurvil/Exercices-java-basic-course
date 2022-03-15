package ExerciciosClasses.Ex6_ContaCorrente;

public class ContaCorrente {
    // Variáveis de instância
    private int numConta;
    private  String nomeCorrentista;
    private double saldo = 0.0;

    // get e set
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos
    void alterarNome(String novoNome){
        this.setNomeCorrentista(novoNome);
    }

    void depositar(double deposito){
        this.setSaldo(saldo + deposito);
    }

    void sacar(double saque){
        if (saldo > saque){
            this.setSaldo(saldo - saque);
        } else {
            System.out.println("Não é possível efetuar o saque nesse valor.");
        }
    }
}

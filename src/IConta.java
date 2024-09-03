public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transfer(double valor, Conta contaDestino);

    void imprimirExtrato();

}

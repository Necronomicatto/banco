public class Main {
    public static void main(String[] args) {
        Cliente california = new Cliente();
        california.setNome("California");

        Conta cc = new ContaCorrente(california);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(california);
        cc.transfer(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}

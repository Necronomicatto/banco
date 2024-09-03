import java.util.List;

public class Banco {
    public String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void getNome(String nome) {
        this.nome = nome;
    }
}

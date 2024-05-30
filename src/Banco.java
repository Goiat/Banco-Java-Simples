import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }
    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    public Conta buscarContaPorNome(String nomeCliente) {
        for (Conta conta : contas) {
            if (conta.getCliente().getNome().equals(nomeCliente)) {
                return conta;
            }
        }
        return null;
    }

}

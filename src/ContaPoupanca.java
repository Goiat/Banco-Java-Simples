import java.util.List;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente clientes) {
        super(clientes);
    }

    @Override
  public void imprimirInfo(){
        System.out.println("=== Conta Poupança ===");
        super.imprimirInfo();
  }
}

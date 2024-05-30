import java.util.List;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente clientes) {
        super(clientes);
    }

    @Override
     public void imprimirInfo(){
         System.out.println("=== Conta Corrente ===");
         super.imprimirInfo();
     }
}
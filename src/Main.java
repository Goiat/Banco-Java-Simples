import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        List<Cliente> listaclientes = new ArrayList<>();
        List<Conta> listaDeContas = new ArrayList<>();
        Banco banco = new Banco(listaDeContas);

        while (opcao != 6){
            System.out.println("===== Escolha uma opção =====");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Depósitar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Extrato");
            System.out.println("6 - Sair");
            System.out.println("=================================");
            System.out.println("Opção:");
            opcao  = input.nextInt();
            input.nextLine();
            switch (opcao){
                case 1:
                    String nome;
                    System.out.println("Forneça seu nome: ");
                    nome = input.nextLine();
                    System.out.println("Nome fornecido: " + nome);
                    Cliente cliente = new Cliente(nome);
                    listaclientes.add(cliente);
                    System.out.println("Escolha entre Conta Poupança ou Conta Corrente:");
                    System.out.println("(1 - Conta poupaça/2 - Conta Corrente.)");
                    int tipoConta = input.nextInt();
                    Conta conta = (tipoConta == 1) ? new ContaPoupanca(cliente) : new ContaCorrente(cliente);
                    listaDeContas.add(conta);
                    break;
                case 2:
                    System.out.println("Depositar para qual conta? Informe o nome do cliente: ");
                    String nomeClientes = input.nextLine();
                    input.nextLine();
                    Conta contaDeposito = banco.buscarContaPorNome(nomeClientes);
                    if (contaDeposito != null){
                        System.out.println("Valor para depositar:");
                        double valorDeposito = input.nextDouble();
                        input.nextLine();
                        contaDeposito.depositar(valorDeposito);
                    }else{
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Valor para depositar: ");
                    double valor = input.nextDouble();
                    input.nextLine();
                    break;
            }
        }
    }
}
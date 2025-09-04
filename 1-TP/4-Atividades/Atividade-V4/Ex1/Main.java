
import java.util.Scanner;


class ContaCorrente {
    public int numeroConta;
    public String nomeCliente;
    public String numeroCPF;
    public double saldoConta;

    ContaCorrente(String nomeCli, int numCon, String numCPF, double saldoCon) {
        nomeCliente = nomeCli;
        numeroConta = numCon;
        numeroCPF = numCPF;
        saldoConta = saldoCon;
    }
}

public class Main{
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){

            System.out.print("Digite o [Nome] do Cliente: ");
            String nomeCliente = entrada.next();

            System.out.print("Digite o [Número da Conta]: ");
            int numeroConta = entrada.nextInt();

            System.out.print("Digite o [CPF] do Cliente: ");
            String numeroCPF = entrada.next();

            System.out.print("Informe o [Saldo] da sua Conta (R$): ");
            double saldoConta = entrada.nextDouble();

            ContaCorrente contaCorrente = new ContaCorrente(nomeCliente, numeroConta, numeroCPF, saldoConta);

            System.out.println("\n== DADOS DA CONTA == ");
            System.out.println("Nome: " + contaCorrente.nomeCliente);
            System.out.println("Nº Conta: " + contaCorrente.numeroConta);
            System.out.println("Nº Conta: " + contaCorrente.numeroCPF);
            System.out.printf("Nº Conta: %.2f", contaCorrente.saldoConta);
        }
    }
}

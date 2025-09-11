
import java.util.Scanner;

class Funcionario{
    private String nomeFuncionario;
    private double salarioBrutoFuncionario;
    private double descontoSalario;

    Funcionario(String nome, double salario, double desconto){
        nomeFuncionario = nome;
        salarioBrutoFuncionario = salario;
        descontoSalario = desconto;
    }

    public double salarioLiquido(double salario, double desconto){
        return salario - desconto;
    }

    public void imprimeDados(){
        System.out.println("\n=== Dados do funcionário === \n");
        System.out.println("Nome: " + nomeFuncionario);
        System.out.printf("Salário Liquido: R$ %.2f\n",  salarioLiquido(salarioBrutoFuncionario, descontoSalario));
    }

    public void aumentoSalario(double porcentagem){
        
    }
}

public class Main {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Nome funcionário: ");
            String nome = entrada.nextLine();
            System.out.print("Salário Bruto: ");
            double salario = entrada.nextDouble();
            System.out.print("Desconto: ");
            double desconto = entrada.nextDouble();

            Funcionario funcionario = new Funcionario(nome, salario, desconto);

            funcionario.imprimeDados();

            System.out.print("\n\nQuantos será o aumento desse funcionario?(%): ");
            double porcentagem = entrada.nextDouble();
            funcionario.aumentoSalario(porcentagem);

            funcionario.imprimeDados();
            
        }
    }
}

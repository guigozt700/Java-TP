
import java.util.Scanner;

class Aluno{
    private String nome;
    private double nota1, nota2, nota3;
    private double notaFinal;

    Aluno(String nome, double n1, double n2, double n3){
        this.nome = nome;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public void imprimeDados(){
        System.out.println("\n=== Dados do Aluno === \n");
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Digite o Nome do Aluno: ");
            String nome = entrada.next();
            System.out.print("Informe a Nota do 1º Trimestre: ");
            double n1 = entrada.nextDouble();
            System.out.print("Informe a Nota do 2º Trimestre: ");
            double n2 = entrada.nextDouble();
            System.out.print("Informe a Nota do 3º Trimestre: ");
            double n3 = entrada.nextDouble();

            Aluno novoAluno = new Aluno(nome, n1, n2, n3);

            novoAluno.imprimeDados();
        }
    }
}

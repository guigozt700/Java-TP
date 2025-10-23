import java.util.Scanner;

public class Main {
    // Nome: Guilherme Gomes da Silva
    // RA: 2171392501143
    // Objetivo: Crie uma classe chamada Estudante que represente um estudante. A
    // classe deve ter campos para o nome do estudante, a idade e a média de notas.
    // Crie métodos para verificar se o estudante foi aprovado (média de notas maior
    // ou igual a 7) e para imprimir informações sobre o estudante. Escreva um
    // programa principal que demonstre o uso dessa classe.
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Informe o nome do estudante: ");
            String nome = sc.nextLine();

            System.out.print("Informe a idade do estudante: ");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.print("Informe a média de notas do estudante: ");
            double media = Double.parseDouble(sc.nextLine());

            Estudante estudante = new Estudante(nome, idade, media);
            estudante.imprimirDados();
        }
    }
}
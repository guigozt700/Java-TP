import java.util.Scanner;

public class Taxa {
    public static void main(String[] args) {
        // Nome: Guilherme Gomes da Silva
        // RA: 2171392511043
        // Objetivo: Faça um programa na Linguagem Java para efetuar o cálculo e a
        // apresentação do valor de uma prestação em atraso, utilizando a fórmula
        // PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) * TEMPO).
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor da prestação (R$): ");
        double valor = entrada.nextDouble();

        System.out.print("Informe a taxa de juros (%): ");
        double taxa = entrada.nextDouble();

        System.out.print("Informe o tempo de atraso (meses): ");
        int tempo = entrada.nextInt();

        double prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.println("Valor da prestação é de: R$ " + prestacao);
        entrada.close();
    }
}

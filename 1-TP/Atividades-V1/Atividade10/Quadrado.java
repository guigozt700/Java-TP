import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        // Nome: Guilherme Gomes da Silva
        // RA: 2171392511043
        // Objetivo: Faça um programa na Linguagem Java para efetuar a leitura de um
        // número inteiro e apresentar o resultado do quadrado desse número
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        int quadrado = num * num;

        System.out.println("O número " + quadrado + " é o quadrado de " + num);

        entrada.close();
    }
}

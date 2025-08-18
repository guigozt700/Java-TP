import java.util.Scanner;

public class Multiplicacao {

    public static void main(String[] args) {
        // Nome: Guilherme Gomes da Silva
        // RA: 2171392511043
        // Objetivo: Faça um programa na Linguagem Java que receba 2 números e apresente
        // a multiplicação dos dois números.

        Scanner inputDados = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        float num1 = inputDados.nextFloat();

        System.out.print("Digite o 2º número: ");
        float num2 = inputDados.nextFloat();

        float mult = num1 * num2;
        System.out.println("O resultado da multiplicação = " + mult);

        inputDados.close();
    }
}
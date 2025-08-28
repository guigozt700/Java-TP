import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        // Nome: Guilherme Gomes da Silva
        // RA: 2171392511043
        // Objetivo: Faça um programa na Linguagem Java  para ler dois valores inteiros para as variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor para [A]: ");
        int a = entrada.nextInt();

        System.out.print("Digite um valor para [B]: ");
        int b = entrada.nextInt();

        int auxilar = b;
        b = a;
        a = auxilar;

        System.out.print("\n-------- Troca ------------\n");
        System.out.println("Valor de [A]: " + a);
        System.out.println("Valor de [B]: " + b);

        entrada.close();
    }
}

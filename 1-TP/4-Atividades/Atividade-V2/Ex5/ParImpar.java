
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        //Nome: Guilherme Gomes da Silva
        //RA: 2171392511043
        //Objetivo: Faça um programa na Linguagem  Java  que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Digite um número: ");
            int num = entrada.nextInt();

            if (num % 2 == 0){
                System.out.println("O número " + num + " é PAR");
            }
            else{
                System.out.println("O número " + num + " é IMPAR");
            }
        }
    }
}

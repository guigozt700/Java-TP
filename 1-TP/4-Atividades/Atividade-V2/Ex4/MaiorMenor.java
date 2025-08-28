
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        //Nome: Guilherme Gomes da Silva
        //RA: 2171392511043
        //Objetivo: Faça um programa na Linguagem  Java  que efetue a leitura de cinco números inteiros e identificar o maior e o menor valor. Não execute a ordenação de valores.
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("1º Número: ");
            int inicial = entrada.nextInt();
            int maior = inicial;
            int menor = inicial;

            for (int i = 2; i < 6; i++){
                System.out.printf("%dº Número: ", i);
                int proximo = entrada.nextInt();

                if (proximo >= maior){
                    maior = proximo;
                }

                if (proximo <= menor){
                    menor = proximo;
                }
            }

            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }
    }
}

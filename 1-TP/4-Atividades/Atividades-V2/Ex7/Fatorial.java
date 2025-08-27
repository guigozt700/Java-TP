import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        //Nome: Guilherme Gomes da Silva
        //RA: 2171392511043
        //Objetivo: Faça um programa na Linguagem Java que que receba um número e mostre o fatorial desse número.
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Número: ");
            int num = entrada.nextInt();
            int fatorial = num;

            for (int i = 1 ; i < num; i++){
                fatorial *= i;
            }

            System.out.printf("O fatorial de %d = %d", num, fatorial);
        }
    }
}

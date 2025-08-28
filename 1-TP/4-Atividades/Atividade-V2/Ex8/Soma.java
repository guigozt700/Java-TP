public class Soma {
    public static void main(String[] args) {
        //Nome: Guilherme Gomes da Silva
        //RA: 2171392511043
        //Objetivo: Faça um programa na Linguagem  Java  para apresentar o total da soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).
        int soma = 0;

        for (int i = 1; i <= 100; i++){
            soma += i;
        }

        System.out.printf("A soma dos números no intervalo (1 até 100) = %d", soma);
    }
}

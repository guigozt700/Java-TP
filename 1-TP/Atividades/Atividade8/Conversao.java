package Atividades.Atividade8;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        //Nome: Guilherme Gomes da Silva
        //RA: 2171392511043
        //Objetivo: Faça um programa na Linguagem Java que efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a cotação do dólar atual (R$): ");
        double cotacao = entrada.nextDouble();

        System.out.print("Informe a quantidade de dólares que deseja converter: ");
        double dolares = entrada.nextDouble();

        double conversao = dolares * cotacao;

        System.out.println("O valor em reais é: R$ " + conversao);

        entrada.close();
    }
}

package Atividades.Atividade5;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        //Nome: Guilherme Gomes da Silva
        //RA: 2171392511043
        //Objetivo: Faça um programa na Linguagem Java que leia a idade de uma pessoa expressa em ano, mês e dia e mostre-as em dias.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o ANO de seu nascimento: ");
        int anos = entrada.nextInt();

        System.out.print("Informe o MES de seu nascimento: ");
        int meses = entrada.nextInt();

        System.out.print("Informe o DIA de seu nascimento: ");
        int dias = entrada.nextInt();

        int idade = (anos * 365) + (meses * 30) + dias;

        System.out.println("A sua idade em dias é igual a: " + idade + " dias");
    }
}

package Atividades.Atividade4;

import java.util.Scanner;

public class Lata {
    public static void main(String[] args) {
        //Nome: Guilherme Gomes da Silva
        //RA: 2171392511043
        //Objetivo: Faça um programa na Linguagem Java  para calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:VOLUME <-- 3.14159 * RAIO2 * ALTURA
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o RAIO da lata: ");
        float raio = entrada.nextFloat();

        System.out.print("Informe a ALTURA da lata: ");
        float altura = entrada.nextFloat();

        double volume = 3.14159 * Math.pow(raio, 2) * altura;
        System.out.println("Volume da lata de oleo é de: " + volume);
    }
}

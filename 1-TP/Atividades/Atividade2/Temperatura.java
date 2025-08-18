import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        // Nome: Guilherme Gomes da Silva
        // RA: 2171392511043
        // Objetivo: Faça um programa na Linguagem Java que leia uma temperatura em
        // graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de
        // conversão é F <-- (9 * C + 160) /5, sendo f a temperatura em Fahrenheit e C a
        // temperatura em Celsius.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a temperatura (°C): ");
        float grausC = entrada.nextFloat();

        float grausF = (9 * grausC + 160) / 5;
        System.out.println("A temperatura " + grausC + " °C convertida é igual a " + grausF + " °F");

        entrada.close();
    }
}

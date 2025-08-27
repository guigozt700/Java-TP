public class CelsiusFahrenheit {
    public static void main(String[] args) {
        //Nome: Guilherme Gomes da Silva
        //RA: 2171392511043
        //Objetivo: Faça um programa na Linguagem  Java  que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas.

        for (int i = 10; i <= 100; i += 10){
            int celsius = i;
            double fah = (9.0 / 5.0) * celsius + 32;
            System.out.printf("Celsius %d -> Fahrenheit %.1f \n", celsius, fah);
        }
    }
}

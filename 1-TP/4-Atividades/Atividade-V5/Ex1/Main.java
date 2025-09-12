
import java.util.Scanner;


class Retangulo{
    public double largura;
    public double altura;

    public Retangulo(double larg, double alt) {
        largura = larg;
        altura = alt;
    }

    public double calcularArea(double larg, double alt){
        return larg * alt;
    }

    public double calcularPerimetro(double larg, double alt){
        return (larg + alt) * 2;
    }

    public double calcularDiagonal(double larg, double alt){
        return Math.sqrt(Math.pow(larg, 2) + Math.pow(alt, 2));
    }
}

public class Main{
    //Nome: Guilherme Gomes da Silva
    //RA: 2171392511043
    //Objetivo:  Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar a tela o valor da sua área, perímetro e diagonal. Usar uma classe como diagrama abaixo: (conforme o PDF)
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Largura: ");
            double largura = entrada.nextDouble();
            System.out.print("Altura: ");
            double altura = entrada.nextDouble();

            Retangulo retangulo = new Retangulo(largura, altura);
            
            System.out.println("\n=== Dados sobre o Retangulo ===\n");
            System.out.printf("Área do Retangulo: %.2f", retangulo.calcularArea(largura, altura));
            System.out.printf("\nPerimetro do Retangulo: %.2f", retangulo.calcularPerimetro(largura, altura));
            System.out.printf("\nDiagonal do Retangulo: %.2f", retangulo.calcularDiagonal(largura, altura));
        }
    }
}
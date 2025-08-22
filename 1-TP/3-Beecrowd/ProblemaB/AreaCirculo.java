import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner entrada = new Scanner(System.in)) {
            double raio = entrada.nextDouble();
            double n = 3.14159;

            double area = n * Math.pow(raio, 2);
            System.out.printf("A=%.4f%n", area);
        } 
    }
}

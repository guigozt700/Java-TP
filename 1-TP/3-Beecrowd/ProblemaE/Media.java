
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            double n1 = entrada.nextDouble();
            double n2 = entrada.nextDouble();
            double media = (n1 * 3.5 + n2 * 7.5) / 11.0;

            System.out.printf("MEDIA = %.5f%n", media);
        }
    }
}

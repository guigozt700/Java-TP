
import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try(Scanner input = new Scanner(System.in)){
            int distancia = input.nextInt();
            double combustivel = input.nextDouble();

            double consumo = distancia / combustivel;
            System.out.printf("%.3f km/l%n", consumo);
        }
    }
}


import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int n1 = entrada.nextInt();
            int n2 = entrada.nextInt();
            int prod = n1 * n2;

            System.out.println("PROD = " + prod);
        }
    }
}

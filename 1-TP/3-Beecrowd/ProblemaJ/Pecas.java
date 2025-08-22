
import java.util.Scanner;

public class Pecas {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){

            int cod1 = input.nextInt();
            int peca1 = input.nextInt();
            double preco1 = input.nextDouble();

            int cod2 = input.nextInt();
            int peca2 = input.nextInt();
            double preco2 = input.nextDouble();

            double valor = (peca1 * preco1) + (peca2 * preco2);

            System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
        }
    }
}

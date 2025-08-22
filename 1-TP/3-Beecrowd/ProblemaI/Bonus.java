
import java.util.Scanner;


public class Bonus {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            String nome = input.nextLine();
            double salarioF = input.nextDouble();
            double vendas = input.nextDouble();

            double salarioB = salarioF + (vendas * 15 /100);
            System.out.printf("TOTAL = R$ %.2f%n", salarioB);
        }
    }
}

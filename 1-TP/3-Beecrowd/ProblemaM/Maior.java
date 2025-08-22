
import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int maiorAB = (a + b + Math.abs(a - b)) / 2;

            // Depois calcula o maior entre maiorAB e c
            int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

            System.out.println(maior + " eh o maior");
        }
    }
}

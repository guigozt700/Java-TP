package 3-Atividades.1-Atv;
import java.util.Scanner;

public class Multiplacao {
    public static void main(String[] args) {
        System.out.println("Digite o 1º número: ");
        Scanner inputDados = new Scanner(System.in);
        float num1 = inputDados.nextLine();
        System.out.println("Digite o 2º número: ");
        float num2 = inputDados.nextLine();
        float mult = num1 * num2;
        System.out.println("O resultado da multiplicação = " + mult);
    }
}

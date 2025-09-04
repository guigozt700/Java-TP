
import java.util.Scanner;

public class Operacao {
    public static void main(String[] args) {

        int[] v = new int[10];
        String[] nomes = {"Ana","Beto","Carlos"};

        for(int i = 0; i < nomes.length; i++){
            System.out.println(v[i]);
        }

        System.out.println("== Entrada == ");

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < v.length; i++){
            System.out.println("Número: ");
            v[i] = sc.nextInt();
        }
    }
}

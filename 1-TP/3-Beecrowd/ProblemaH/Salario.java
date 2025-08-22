
import java.util.Scanner;

//package 1-TP.3-Beecrowd.ProblemaH;

public class Salario {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            int numberF = input.nextInt();
            int salario = input.nextInt();
            double horasT = input.nextDouble();

            double sal = salario * horasT;

            System.out.println("NUMBER = " + numberF);
            System.out.printf("SALARY = U$ %.2f%n", sal);
        }
    }
}

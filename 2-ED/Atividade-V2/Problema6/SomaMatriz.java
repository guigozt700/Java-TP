
import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            int[][] mat1 = new int[2][2];
            int[][] mat2 = new int[2][2];
            int somaMat1 = 0;
            int somaMat2 = 0;

            for (int linha = 0; linha < mat1.length; linha++) {
                for(int coluna = 0; coluna < mat1[linha].length; coluna++){
                    System.out.printf("Valor para Matriz 1: linha[%d] coluna[%d]: ", linha, coluna);
                    mat1[linha][coluna] = entrada.nextInt();
                    somaMat1 += mat1[linha][coluna];
                }
            }

            System.out.println("\n-------------------------\n");

            for (int linha = 0; linha < mat2.length; linha++) {
                for(int coluna = 0; coluna < mat2[linha].length; coluna++){
                    System.out.printf("Valor para Matriz 2: linha[%d] coluna[%d]: ", linha, coluna);
                    mat2[linha][coluna] = entrada.nextInt();
                    somaMat2 += mat2[linha][coluna];
                }
            }

            System.out.println("\nSoma das Matrizes: " + (somaMat1 + somaMat2));
        }    
    }
}

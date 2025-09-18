

public class MultMatriz {
    public static void main(String[] args) {
            int[][] mat1 = {
                {1,2},
                {3,4}
            };

            int[][] mat2 = {
                {5,6},
                {7,8}
            };
            int multMat1 = 1;
            int multMat2 = 1;

            for (int linha = 0; linha < mat1.length; linha++) {
                for(int coluna = 0; coluna < mat1[linha].length; coluna++){
                    multMat1 *= mat1[linha][coluna];
                }
            }

            System.out.println("\n-------------------------\n");

            for (int linha = 0; linha < mat2.length; linha++) {
                for(int coluna = 0; coluna < mat2[linha].length; coluna++){
                    multMat2 *= mat2[linha][coluna];
                }
            }

            System.out.println("\nMultiplicação das Matrizes: " + (multMat1 * multMat2));
        }    
    }

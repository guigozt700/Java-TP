public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriz completa: \n");
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }

        System.out.println("\nElemento [1][2]: " + matriz[1][2]);
    }
}

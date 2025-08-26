class Array{
    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Tamanho do array: " + numeros.length);

        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indice: [" + i + "] Elemento: [" + numeros[i] + "]");
        }
    }
}
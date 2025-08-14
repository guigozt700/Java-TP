//package 2-ED.2-Aula-ED.2-Array;

public class Array {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50}; 
        int i = 0;

        i = (i + 1) % numeros.length; //Acessa o elemento de indice 1 
        System.out.println("Próximo elemento: " + numeros[i]);
    }
}

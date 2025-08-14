//package 2-ED.2-Aula-ED.3-For;

public class Agregacao {
    public static void main(String[] args) {
 
        int[] valores = {2, 4, 6, 8};
        int soma = 0;

        for (int v : valores){
            soma += v;
        }
        
        System.out.println("Soma total: " + soma);
    }
}

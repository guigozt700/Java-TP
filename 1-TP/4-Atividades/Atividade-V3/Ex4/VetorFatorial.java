
import java.util.Scanner;

public class VetorFatorial {

    public static int calcularFatorial(int num){
    int fatorial = num;

    for (int i = 1; i < num; i++){
        fatorial *= num;
    }
    
    return fatorial;
}

    public static void main(String[] args) {
        
        // Nome: Guilherme Gomes da Silva'
        // RA: 2171392511043
        // Objetivo: Criar um vetor A do tipo inteiro de 5 elementos–	Solicitar os valores para o usuário e inserir no vetor A–	Criar um vetor B do tipo inteiro  –	Ler o vetor A e para cada elemento lido calcular o fatorial e gravar no B–	Após de todos os elementos do vetor A, mostrar os dois vetores
        try(Scanner entrada = new Scanner(System.in)){
            int[] A = new int[5];

            for (int i = 0; i < A.length; i++){
                System.out.printf("Digite um númeoro para posição [%d]: ", i+1);
                A[i] = entrada.nextInt();
            }

            int[] B = new int[5];

            for (int i = 0; i < B.length; i++){
                B[i] = calcularFatorial(A[i]);
            }
        }
    }
}

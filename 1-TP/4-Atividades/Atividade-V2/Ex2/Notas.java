
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        //Nome: Guilherme Gomes da Silva
        //RA: 2171392511043
        //Objetivo: Faça um programa na Linguagem  Java  que leia quatros valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o valor da média do aluno para qualquer condição.
        try(Scanner entrada = new Scanner(System.in)){
            System.out.print("Digite a 1ª nota: ");
            double notas1 = entrada.nextDouble();
            System.out.print("Digite a 2ª nota: ");
            double notas2 = entrada.nextDouble();
            System.out.print("Digite a 3ª nota: ");
            double notas3 = entrada.nextDouble();
            System.out.print("Digite a 4ª nota: ");
            double notas4 = entrada.nextDouble();

            double media = (notas1 + notas2 + notas3 + notas4) / 4;

            if (media >= 7.0){
                System.out.println("ALUNO APROVADO! com a média: " + media);
            }
            else{
                System.out.println("ALUNO REPROVADO! com a média: " + media);
            }
        }
    }    
}

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args)throws Exception {

        Scanner entrada = new Scanner(System.in);

        // Entrada de dados -> Usuario digita via teclado, arquivo ou rede
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        // Conversão de dado para inteiro
        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(entrada.nextLine());

        // Processamento -> Manipulação e tratamento da entrada, e o que eu vou fazer
        // com ela
        String mensagem = String.format("Olá %s, você tem %d anos", nome, idade);

        // Saída -> Apresentação final
        System.out.print(mensagem);

        entrada.close();
    }
}

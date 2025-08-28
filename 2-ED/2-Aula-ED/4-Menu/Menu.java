
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            boolean control = true;
            do { 
                System.out.println("===== Menu =====");
                System.out.println("Aperte [1] para Cadastrar");
                System.out.println("Aperte [2] para Atualizar");
                System.out.println("Aperte [3] para Excluir");
                System.out.println("Aperte [0] para Encerrar o Menu");
                System.out.print("Opção: ");
                int opcao = entrada.nextInt();

                switch(opcao){
                    case 1 -> {
                        System.out.print("Função cadastro!");
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.print("Função atualizar!");
                        System.out.println();
                    }
                    case 3 -> {
                        System.out.print("Função excluir!");
                        System.out.println();
                    }
                    case 0 -> {
                        System.out.print("Função encerrar!");
                        System.out.println();
                        control = false;
                    }
                    default -> {
                        System.out.print("Algo deu errado, tente novamente: ");
                        System.out.println();
                    }
                }

            } while (control);

            System.out.println("\nObrigado por utilizar...");
        }
    }
}

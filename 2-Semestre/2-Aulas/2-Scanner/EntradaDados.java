import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) throws Exception {
        Scanner meuScanner = new Scanner(System.in); // meuScanner instancia da classe Scanner
        System.out.println("Seu nome: ");
        String nome = meuScanner.nextLine();
        System.out.println("Bom dia " + nome);
    }
}
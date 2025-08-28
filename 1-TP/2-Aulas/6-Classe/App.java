public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();

        cliente.cpf = "11122233344";
        cliente.nome = "Guilherme";
        cliente.idCliente = 1;

        cliente.metodo();
    }
}

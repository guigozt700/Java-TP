public class App {
    public static void main(String[] args) {
        Carro c1 = new Carro("Volks", "Fox", "Preto");

        System.out.println(c1.mostrar());

        System.out.println(c1.getModelo());

        c1.setModelo("Tera");

        System.out.println(c1.mostrar());
    }
}

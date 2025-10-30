public class Main {
    public static void main(String[] args) {
        //Nome: Guilherme Gomes da Silva
        //RA: 2171392511043
        Retangulo retangulo = new Retangulo(5, 3, "Azul");
        Quadrado quadrado = new Quadrado(4, "Verde");
        Triangulo triangulo = new Triangulo(6, 2, "Amarelo");
        Circulo circulo = new Circulo(3, "Vermelho");

        retangulo.toString();
        quadrado.toString();
        triangulo.toString();
        circulo.toString();
    }
}

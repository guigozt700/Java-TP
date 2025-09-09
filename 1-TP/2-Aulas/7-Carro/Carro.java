public class Carro {
    private String marca;
    private String modelo;
    private String cor;

    public Carro(String ma, String mo, String co) {
        this.marca = ma;
        this.modelo = mo;
        this.cor = co;
    }

    public String mostrar() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nCor: " + cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String mo) {
        this.modelo = mo;
    }
}

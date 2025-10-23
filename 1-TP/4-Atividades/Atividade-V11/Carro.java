public class Carro extends Veiculo{
    private int numeroPortas;

    Carro(String ma, String mo, int y, int numP){
        super(ma, mo, y);
        this.numeroPortas = numP;
    }

    @Override
    public void acelerar(){
        System.out.println("Acelerando carro...\n");
    }

    public void imprimeDados(){
        System.out.println("=== DADOS DO CARRO === \n");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Numero de portas: " + numeroPortas);
        acelerar();
    }
}

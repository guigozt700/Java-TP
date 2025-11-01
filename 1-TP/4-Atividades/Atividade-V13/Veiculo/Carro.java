public class Carro extends Veiculo{
    private double valorBase;

    Carro(String ma, String mo, int y, double vl){
        super(ma, mo, y);
        this.valorBase = vl;
    }

    @Override
    public double calcularImposto(){
        return valorBase * (4.0 / 100);
    }

    @Override
    public void imprimeDetalhes(){
        super.imprimeDetalhes();
        System.out.printf("Valor Base: R$ %.2f",  valorBase);
        System.out.printf("Imposto: R$ %.2f", calcularImposto());
        System.out.println("\n");
    }
}

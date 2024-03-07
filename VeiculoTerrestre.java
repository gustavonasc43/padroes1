public abstract class VeiculoTerrestre extends Veiculo {
    protected String motor;
    protected String placa;

    public VeiculoTerrestre(String identificacao, double valorCompra, String motor, String placa) {
        super(identificacao, valorCompra);
        this.motor = motor;
        this.placa = placa;
    }
}
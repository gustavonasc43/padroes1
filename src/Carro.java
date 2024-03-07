class Carro extends VeiculoTerrestre {
    public Carro(String identificacao, double valorCompra, String motor, String placa) {
        super(identificacao, valorCompra, motor, placa);
    }

    @Override
    public double calcularDiaria() {
        return 0.02 * valorCompra;
    }
}
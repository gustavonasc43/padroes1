class Onibus extends VeiculoTerrestre {
    private int quantidadePassageiros;

    public Onibus(String identificacao, double valorCompra, String motor, String placa, int quantidadePassageiros) {
        super(identificacao, valorCompra, motor, placa);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    @Override
    public double calcularDiaria() {
        return 0.04 * valorCompra + 100 * quantidadePassageiros;
    }
}
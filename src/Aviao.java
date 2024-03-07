class Aviao extends VeiculoAereo {
    private double velocidadeCruzeiro;

    public Aviao(String identificacao, double valorCompra, double velocidadeCruzeiro, double tempoDeVoo) {
        super(identificacao, valorCompra, tempoDeVoo);
        this.velocidadeCruzeiro = velocidadeCruzeiro;
    }

    @Override
    public double calcularDiaria() {
        return 0.20 * valorCompra + 1000 * velocidadeCruzeiro;
    }
}
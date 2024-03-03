class Aviao extends Veiculo {
    private double velocidadeCruzeiro;

    public Aviao(String identificacao, double valorCompra, double velocidadeCruzeiro) {
        super(identificacao, valorCompra);
        this.velocidadeCruzeiro = velocidadeCruzeiro;
    }

    @Override
    public double calcularDiaria() {
        return 0.20 * valorCompra + 1000 * velocidadeCruzeiro;
    }
}

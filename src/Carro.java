class Carro extends Veiculo {
    public Carro(String identificacao, double valorCompra) {
        super(identificacao, valorCompra);
    }

    @Override
    public double calcularDiaria() {
        return 0.02 * valorCompra;
    }
}

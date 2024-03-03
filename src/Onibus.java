class Onibus extends Veiculo {
    private int quantidadePassageiros;

    public Onibus(String identificacao, double valorCompra, int quantidadePassageiros) {
        super(identificacao, valorCompra);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    @Override
    public double calcularDiaria() {
        return 0.04 * valorCompra + 100 * quantidadePassageiros;
    }
}
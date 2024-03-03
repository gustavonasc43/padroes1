class Helicoptero extends Veiculo {
    private int quantidadeRotores;

    public Helicoptero(String identificacao, double valorCompra, int quantidadeRotores) {
        super(identificacao, valorCompra);
        this.quantidadeRotores = quantidadeRotores;
    }

    @Override
    public double calcularDiaria() {
        return 0.10 * valorCompra * quantidadeRotores;
    }
}
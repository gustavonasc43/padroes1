class Helicoptero extends VeiculoAereo {
    private int quantidadeRotores;

    public Helicoptero(String identificacao, double valorCompra, int quantidadeRotores, double tempoDeVoo) {
        super(identificacao, valorCompra, tempoDeVoo);
        this.quantidadeRotores = quantidadeRotores;
    }

    @Override
    public double calcularDiaria() {
        return 0.10 * valorCompra * quantidadeRotores;
    }
}
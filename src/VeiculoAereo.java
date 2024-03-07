public abstract class VeiculoAereo extends Veiculo {
    protected double tempoDeVoo;

    public VeiculoAereo(String identificacao, double valorCompra, double tempoDeVoo) {
        super(identificacao, valorCompra);
        this.tempoDeVoo = tempoDeVoo;
    }
}

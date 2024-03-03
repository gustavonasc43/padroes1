public abstract class Veiculo {
    protected String identificacao;
    protected double valorCompra;

    public Veiculo(String identificacao, double valorCompra) {
        this.identificacao = identificacao;
        this.valorCompra = valorCompra;
    }

    public abstract double calcularDiaria();
}
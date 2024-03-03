class Moto extends Veiculo {
    private String sistemaPartida;

    public Moto(String identificacao, double valorCompra, String sistemaPartida) {
        super(identificacao, valorCompra);
        this.sistemaPartida = sistemaPartida;
    }

    @Override
    public double calcularDiaria() {
        if (sistemaPartida.equals("elétrico")) {
            return 0.02 * valorCompra + 20;
        } else if (sistemaPartida.equals("manual")) {
            return 0.02 * valorCompra + 5;
        }
        return 0;
    }
}
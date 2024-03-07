class Moto extends VeiculoTerrestre {
    private String sistemaPartida;

    public Moto(String identificacao, double valorCompra, String motor, String placa, String sistemaPartida) {
        super(identificacao, valorCompra, motor, placa);
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
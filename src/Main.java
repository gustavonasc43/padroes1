public class Main {
    public static void main(String[] args) {
        GerenciadorVeiculos gerenciador = new GerenciadorVeiculos();

        Aviao aviao1 = new Aviao("AV001", 1000000, 500);
        Carro carro1 = new Carro("CAR001", 30000);
        Helicoptero heli1 = new Helicoptero("HEL001", 500000, 4);
        Moto moto1 = new Moto("MOT001", 20000, "elétrico");
        Onibus onibus1 = new Onibus("ONI001",150000, 50);
        Aviao aviao2  =new Aviao("BV002", 10, 1);


        gerenciador.adicionarVeiculo(aviao1);
        gerenciador.adicionarVeiculo(carro1);
        gerenciador.adicionarVeiculo(heli1);
        gerenciador.adicionarVeiculo(moto1);
        gerenciador.adicionarVeiculo(onibus1);
        gerenciador.adicionarVeiculo(aviao2);


        System.out.println("Valor da diária do avião AV001: " + gerenciador.calcularDiariaPorIdentificacao("AV001"));
        System.out.println("Quantidade de veículos cadastrados: " + gerenciador.quantidadeVeiculosCadastrados());

        System.out.println("Veículos do tipo Avião:");
        for (Veiculo aviao : gerenciador.veiculosPorTipoOrdenados(Aviao.class)) {
            System.out.println(aviao.identificacao);
        }

        System.out.println("Veículos do tipo Carro:");
        for (Veiculo carro : gerenciador.veiculosPorTipoOrdenados(Carro.class)) {
            System.out.println(carro.identificacao);
        }

        System.out.println("Veículos do tipo Helicoptero:");
        for (Veiculo helicoptero : gerenciador.veiculosPorTipoOrdenados(Helicoptero.class)) {
            System.out.println(helicoptero.identificacao);
        }

        System.out.println("Veículos do tipo Moto:");
        for (Veiculo moto : gerenciador.veiculosPorTipoOrdenados(Moto.class)) {
            System.out.println(moto.identificacao);
        }

        System.out.println("Veículos do tipo Onibus:");
        for (Veiculo onibus : gerenciador.veiculosPorTipoOrdenados(Onibus.class)) {
            System.out.println(onibus.identificacao);
        }

        Veiculo veiculoMaisCaro = gerenciador.veiculoComDiariaMaisCara();
        if (veiculoMaisCaro != null) {
            System.out.println("Veículo com diária mais cara: " + veiculoMaisCaro.identificacao);
        }
    }
}
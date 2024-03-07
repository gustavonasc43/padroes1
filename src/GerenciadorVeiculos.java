import java.util.*;
import java.util.stream.Collectors;

class GerenciadorVeiculos {
    private List<Veiculo> veiculos;

    public GerenciadorVeiculos() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (!veiculoJaCadastrado(veiculo)) {
            veiculos.add(veiculo);
            System.out.println("Veículo cadastrado com sucesso.");
        } else {
            System.out.println("Já existe um veículo com essa identificação.");
        }
    }

    private boolean veiculoJaCadastrado(Veiculo veiculo) {
        return veiculos.stream().anyMatch(v -> v.identificacao.equals(veiculo.identificacao));
    }

    public double calcularDiariaPorIdentificacao(String identificacao) {
        Optional<Veiculo> veiculoEncontrado = veiculos.stream()
                .filter(v -> v.identificacao.equals(identificacao))
                .findFirst();
        if (veiculoEncontrado.isPresent()) {
            return veiculoEncontrado.get().calcularDiaria();
        } else {
            System.out.println("Veículo não encontrado.");
            return 0;
        }
    }

    public int quantidadeVeiculosCadastrados() {
        return veiculos.size();
    }

    public List<Veiculo> veiculosPorTipoOrdenados(Class<? extends Veiculo> tipo) {
        return veiculos.stream()
                .filter(tipo::isInstance)
                .sorted(Comparator.comparing(v -> v.identificacao))
                .collect(Collectors.toList());
    }

    public Veiculo veiculoComDiariaMaisCara() {
        if (veiculos.isEmpty()) {
            System.out.println("Não há veículos cadastrados.");
            return null;
        }
        return Collections.max(veiculos, Comparator.comparing(Veiculo::calcularDiaria));
    }
}
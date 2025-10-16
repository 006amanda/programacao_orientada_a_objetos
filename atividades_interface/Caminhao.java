public class Caminhao extends Veiculo {
    private double valorBase = 250.0;

    public Caminhao(String placa, String modelo, int ano) {
        super(placa, modelo, ano);
    }

    @Override
    public double calcularDiaria(int dias) {
        return valorBase * dias;
    }

    @Override
    public String toString() {
        return "Caminhão -> Placa + infos: " + super.toString();
    }
}

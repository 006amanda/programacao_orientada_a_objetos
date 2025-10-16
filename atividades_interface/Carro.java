public class Carro extends Veiculo {
    private double valorBase = 150.0;

    public Carro(String placa, String modelo, int ano) {
        super(placa, modelo, ano);
    }

    @Override
    public double calcularDiaria(int dias) {
        return valorBase * dias;
    }

    @Override
    public String toString() {
        return "Carro -> Placa + infos: " + super.toString();
    }
}

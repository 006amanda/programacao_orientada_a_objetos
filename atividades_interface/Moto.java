public class Moto extends Veiculo {
    private double valorBase = 80.0;

    public Moto(String placa, String modelo, int ano) {
        super(placa, modelo, ano);
    }

    @Override
    public double calcularDiaria(int dias) {
        return valorBase * dias;
    }

    @Override
    public String toString() {
        return "Moto -> Placa + infos: " + super.toString();
    }
}

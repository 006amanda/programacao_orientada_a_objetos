public class Circulo extends Forma {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.1416;
        return pi * (raio * raio);
    }

    @Override
    public String toString() {
        return "Círculo " + getCor() + " -> Área: " + calcularArea();
    }
}

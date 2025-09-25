public class CalculadoraCientifica extends CalculadoraBase {
    public double somar(double a, double b) {
        return a + b;
    }
    public int somar(int... valores) {
    int soma = 0;
    for (int i = 0; i < valores.length; i++) {
        soma += valores[i];
    }
    return soma;
}
    public String somar(String a, String b) {
        return a + b;
    }
}

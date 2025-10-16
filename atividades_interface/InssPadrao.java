public class InssPadrao implements RegraImposto {
    @Override
    public double calcularDesconto(double salarioBruto) {
        return salarioBruto * 0.11;
    }

    @Override
    public String toString() {
        return "INSS Padrão";
    }
}

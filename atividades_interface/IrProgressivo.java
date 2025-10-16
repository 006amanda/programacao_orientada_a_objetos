public class IrProgressivo implements RegraImposto {
    @Override
    public double calcularDesconto(double salarioBruto) {
        double imposto = 0;

        if (salarioBruto <= 2000) {
            imposto = 0;
        } else if (salarioBruto <= 4000) {
            imposto = salarioBruto * 0.10;
        } else {
            imposto = salarioBruto * 0.20;
        }

        return imposto;
    }

    @Override
    public String toString() {
        return "IR Progressivo";
    }
}

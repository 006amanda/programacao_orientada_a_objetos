public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000.0, 500.0);

        System.out.println("Saldo: " + cc.getSaldo());
        System.out.println("Limite: " + cc.getLimite());
    }
}

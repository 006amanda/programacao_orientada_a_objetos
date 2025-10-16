public class Funcionario {
    private String nome;
    private String cargo;
    private double salarioBase;
    private double bonus;

    public Funcionario(String nome, String cargo, double salarioBase, double bonus) {
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    public double calcularSalarioBruto() {
        return salarioBase + bonus;
    }

    public double calcularSalarioLiquido(RegraImposto regra) {
        double bruto = calcularSalarioBruto();
        double imposto = regra.calcularDesconto(bruto);
        return bruto - imposto;
    }

    @Override
    public String toString() {
        return nome + " -> " + cargo;
    }
}

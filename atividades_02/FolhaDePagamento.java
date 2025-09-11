public class FolhaDePagamento {
    public double calcularDescontos(Funcionario f) {
        double bruto = f.salarioBruto();
        double inss = bruto * 0.10;
        double sindicato = bruto * 0.03;
        return inss + sindicato;
    }

    public double salarioLiquido(Funcionario f) {
        return f.salarioBruto() - calcularDescontos(f);
    }

    public String gerarHolerite(Funcionario f) {
        double bruto = f.salarioBruto();
        double descontos = calcularDescontos(f);
        double liquido = salarioLiquido(f);

        return "Funcionario: " + f.getNome() +
                " -> Cargo: " + f.getCargo() +
                " -> Salário Bruto: " + bruto +
                " -> Descontos: " + descontos +
                " -> Salário Líquido: " + liquido;
    }
}

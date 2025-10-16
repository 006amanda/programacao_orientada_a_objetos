import java.util.*;
public class FolhaPagamento {
    private RegraImposto regraImposto;

    public FolhaPagamento(RegraImposto regraInicial) {
        this.regraImposto = regraInicial;
    }
    public void setRegraImposto(RegraImposto novaRegra) {
        this.regraImposto = novaRegra;
    }

    public void calcularFolha(List<Funcionario> funcionarios) {
        System.out.println("Folha de Pagamento: ");
        System.out.println("Regra de Imposto: " + regraImposto.toString());

        for (Funcionario f : funcionarios) {
            double bruto = f.calcularSalarioBruto();
            double liquido = f.calcularSalarioLiquido(regraImposto);
            System.out.println(f + "-> Bruto: R$ " + bruto + " -> Líquido: R$ " + liquido);
        }
    }
}

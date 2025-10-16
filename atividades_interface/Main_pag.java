import java.util.*;
public class Main_pag {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Amanda", "Gerente", 5000, 800));
        funcionarios.add(new Funcionario("Cícero", "Analista", 3500, 400));
        funcionarios.add(new Funcionario("Matias", "Assistente", 2200, 200));

        FolhaPagamento folha = new FolhaPagamento(new InssPadrao());
        folha.calcularFolha(funcionarios);
        System.out.println();
        folha.setRegraImposto(new IrProgressivo());
        folha.calcularFolha(funcionarios);
    }
}

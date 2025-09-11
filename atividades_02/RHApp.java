public class RHApp {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", "001", "Analista", 4000, 500);
        Funcionario f2 = new Funcionario("Carlos", "002", "Programador", 3500, 400);

        FolhaDePagamento folha = new FolhaDePagamento();


        // =================================
        System.out.println("HOLERITES INICIAIS: ");
        System.out.println(folha.gerarHolerite(f1));
        System.out.println(folha.gerarHolerite(f2));


        // =================================
        f1.promover("Senior", 20); // +20% de aumento
        f1.setBeneficios(700); // ajuste de benefícios

        System.out.println("HOLERITE APÓS PROMOÇÃO:");
        System.out.println(folha.gerarHolerite(f1));


        // =================================
        f2.aplicarAjuste(-5); // redução de 5%

        System.out.println("HOLERITE APÓS AJUSTE NEGATIVO: ");
        System.out.println(folha.gerarHolerite(f2));
    }
}

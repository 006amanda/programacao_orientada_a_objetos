public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public static void main(String[] args) {
        Gerente ana = new Gerente("Ana", "Marketing");

        System.out.println("GERÊNCIA: ");
        System.out.println(ana.getNome() + " -> " + ana.getDepartamento());
    }
}

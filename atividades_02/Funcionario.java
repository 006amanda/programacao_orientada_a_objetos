public class Funcionario {
    private String nome;
    private String matricula;
    private String cargo;
    private double salarioBase;
    private double beneficios;

    public Funcionario(String nome, String matricula, String cargo, double salarioBase, double beneficios) {
        this.nome = nome;
        this.matricula = matricula;
        setCargo(cargo);
        setSalarioBase(salarioBase);
        setBeneficios(beneficios);
    }


    // =================================
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setSalarioBase(double v) {
        if (v >= 0) {
            this.salarioBase = v;
        }
    }

    public void setBeneficios(double v) {
        if (v >= 0) {
            this.beneficios = v;
        }
    }

    public void setCargo(String c) {
        if (c != null && c.length() > 0) {
            this.cargo = c;
        }
    }


    // =================================
    public void aplicarAjuste(double percentual) {
        double novoSalario = salarioBase + (salarioBase * percentual / 100);
        if (novoSalario >= 0) {
            this.salarioBase = novoSalario;
        }
    }

    // =================================
    public void promover(String novoCargo, double aumentoPercentual) {
        setCargo(novoCargo);
        aplicarAjuste(aumentoPercentual);
    }

    // =================================
    public double salarioBruto() {
        return salarioBase + beneficios;
    }
}

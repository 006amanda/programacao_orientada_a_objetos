public class Professor extends Escola {
    private String materia;

    public Professor(String nomeEscola, String materia) {
        this.nomeEscola = nomeEscola;
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }

    public static void main(String[] args) {
        Professor cassol = new Professor("Faculdade Antonio Meneghetti", "Programação Orientada a Objetos");
        System.out.println();
        System.out.println("Luciano Cassol");
        System.out.println("Disciplina: " + cassol.getMateria());
        System.out.println("Local de ensino: " + cassol.getNomeEscola());
    }
}

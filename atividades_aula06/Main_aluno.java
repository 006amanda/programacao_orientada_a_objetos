public class Main_aluno {
    public static void main(String[] args){

        Aluno amanda = new Aluno();
        amanda.nome = "Amanda Roos da Costa";
        amanda.idade = 18;
        amanda.matricula = "007590";

        System.out.println("IDENTIFICAÇÃO DO ALUNO");
        System.out.println("NOME: " + amanda.nome);
        System.out.println("IDADE: " + amanda.idade);
        System.out.println("MATRÍCULA/RA: " + amanda.matricula);
    }
}

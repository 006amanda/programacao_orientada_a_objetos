public class Carro extends Veiculo{
    protected String modelo;
    protected int ano;

    public static void main(String[] args){
        Carro dodge = new Carro();
        dodge.marca = "Dodge";
        dodge.modelo = "Challenger SRT Demon 170";
        dodge.ano = 2023;

        Carro ferrari = new Carro();
        ferrari.marca = "Ferrari";
        ferrari.modelo = "Purosangue";
        ferrari.ano = 2022;

        Carro mustang = new Carro();
        mustang.marca = "Mustang";
        mustang.modelo = "GT Performance";
        mustang.ano = 2025;

        System.out.println("CARROS QUE ESTÃO NA SUA GARAGEM: ");
        System.out.println("Carro nº 1: ");
        System.out.println(dodge.marca + " " + dodge.modelo + " " + dodge.ano);
        System.out.println();
        System.out.println("Carro nº 2: ");
        System.out.println(ferrari.marca + " " + ferrari.modelo + " " + ferrari.ano);
        System.out.println();
        System.out.println("Carro nº 3: ");
        System.out.println(mustang.marca + " " + mustang.modelo + " " + mustang.ano);
    }
}

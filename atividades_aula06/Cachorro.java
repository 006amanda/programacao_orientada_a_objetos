public class Cachorro extends Animal{

    protected String raca;

    public static void main(String[] args){
        Cachorro cao = new Cachorro();
        cao.especie = "Cachorro (Canis lupus familiaris)";
        cao.raca = "Pinscher";

        System.out.println("O animal é da espécie: " + cao.especie);
        System.out.println("O cão é da raça: " + cao.raca);
    }
}

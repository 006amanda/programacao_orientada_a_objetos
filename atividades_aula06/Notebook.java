public class Notebook extends Computador{
    protected double peso;

    public static void main(String[] args){
        Notebook nitro = new Notebook();
        nitro.processador = "Intel Core i5-13420H de 13ª geração";
        nitro.peso = 2.11;

        System.out.println("Notebook Acer Nitro V 15");
        System.out.println("Processador: " + nitro.processador);
        System.out.println("Peso: " + nitro.peso + " quilogramas");
    }
}

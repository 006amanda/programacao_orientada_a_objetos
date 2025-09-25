public class Celular extends Eletronico{
    protected int numeroSerie;

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public static void main(String[] args){
        Celular n1 = new Celular();
        n1.fabricante = "Fabricante Y";
        n1.numeroSerie = 462356479;

        System.out.println("Lista de Pedidos: ");
        System.out.println(n1.fabricante);
        System.out.println("Número de série: " + n1.numeroSerie);
    }
}

public class Caneta {
    String cor;
    Double espessura;

    public Caneta(String cor, Double espessura){ // construtor
        this.cor = cor;
        this.espessura = espessura;

    }

    public void escrever(String texto) { // criação do método escrever
        System.out.println(this.cor + " -> " + texto);
    }


}

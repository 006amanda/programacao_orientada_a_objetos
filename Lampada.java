public class Lampada {
    boolean ligada;

    public void ligada(){
        this.ligada = true;
    }

    public void desligada(){
        this.ligada = false;
    }

    public void isLigada() {
        String modo;
        if (this.ligada == true) {
            System.out.println("Lâmpada ligada.");
        } else {
            System.out.println("Lâmpada desligada.");
        }
    }
}

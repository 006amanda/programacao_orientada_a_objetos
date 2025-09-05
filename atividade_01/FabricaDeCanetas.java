public class FabricaDeCanetas {

    public Caneta criarVermelha(){
        Caneta caneta = new Caneta("VERMELHA", 0.8);
        return caneta;
    }

    public Caneta criarAzul(){
        Caneta caneta = new Caneta("AZUL", 0.7);
        return caneta;
    }

    public Caneta criarPreta(){
        Caneta caneta = new Caneta("PRETA", 0.9);
        return caneta;
    }
}

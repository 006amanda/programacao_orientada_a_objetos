public class Main {
    public static void main(String[] args){

//        Caneta scn = new Caneta(); // o objeto é criado a partir da inserção do "new", ou seja, é a instância de uma classe

        System.out.println("MINHAS CANETAS: ");

        Caneta cnt1 = new Caneta("VERMELHA", 0.8); // caneta 1
//        cnt1.cor = "VERMELHA";
//        cnt1.espessura = 0.8;
        System.out.println("--> " + cnt1.cor + ". A sua espessura é de " + cnt1.espessura + "mm");
        cnt1.escrever("Essa é a cor da caneta 1"); // chamo o método escrever

        System.out.println();

        Caneta cnt2 = new Caneta("AZUL", 0.7); // caneta 2
//        cnt2.cor = "AZUL";
//        cnt2.espessura = 0.7;
        System.out.println("--> " + cnt2.cor + ". A sua espessura é de " + cnt2.espessura + "mm");
        cnt2.escrever("Essa é a cor da caneta 2");

        System.out.println();

        Caneta cnt3 = new Caneta("PRETA", 0.9); // caneta 3
//        cnt2.cor = "PRETA";
//        cnt2.espessura = 0.9;
        System.out.println("--> " + cnt3.cor + ". A sua espessura é de " + cnt3.espessura + "mm");
        cnt3.escrever("Essa é a cor da caneta 3");

        System.out.println("|");
        System.out.println("|");


        System.out.println("ESTADO DA LÂMPADA: ");

        Lampada lp = new Lampada();
        lp.ligada();
        lp.isLigada();
        lp.desligada();
        lp.isLigada();

        System.out.println("|");
        System.out.println("|");



        System.out.println("CANETA FAVORITA: ");

        Mesa ms = new Mesa(cnt1);
        ms.canetaFavorita.escrever("Essa é a cor da minha caneta favorita");

        System.out.println("|");
        System.out.println("|");



        System.out.println("CANETAS ADICIONADAS: ");

        FabricaDeCanetas fb = new FabricaDeCanetas();
        Caneta canetaVermelha = fb.criarVermelha();
        canetaVermelha.escrever("Cor da caneta criada");

        System.out.println("---");

        Caneta canetaAzul = fb.criarAzul();
        canetaAzul.escrever("Cor da caneta criada");

        System.out.println("---");

        Caneta canetaPreta = fb.criarPreta();
        canetaPreta.escrever("Cor da caneta criada");

        System.out.println("---");

    }
}
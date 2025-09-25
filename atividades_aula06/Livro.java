public class Livro extends Produto{
    protected String autor;
    protected String titulo;

    public static void main(String[] args){

        Livro lv1 = new Livro();
        lv1.preco = 69.90f;
        lv1.autor = "Ciclano da Silva";
        lv1.titulo = "Meu primeiro livro";

        Livro lv2 = new Livro();
        lv2.preco = 79.90f;
        lv2.autor = "Fulano de Tal";
        lv2.titulo = "Como escrever um livro";

        Livro lv3 = new Livro();
        lv3.preco = 49.90f;
        lv3.autor = "Beltrano dos Santos";
        lv3.titulo = "Fazendo seu livro pt.2";

        Livro lv4 = new Livro();
        lv4.preco = 54.90f;
        lv4.autor = "Fulano da Silva de Tal";
        lv4.titulo = "Fazendo um pudim";

        Livro lv5 = new Livro();
        lv5.preco = 59.90f;
        lv5.autor = "Ciclana Mendes";
        lv5.titulo = "Aprenda a fazer um labubu";



// ########################################################
        System.out.println("LIVROS À VENDA:");
        System.out.println("TÍTULO: " + lv1.titulo);
        System.out.println("AUTOR: " + lv1.autor);
        System.out.println("PREÇO DE VENDA: R$" + lv1.preco);
        System.out.println("-------------------------------");
        System.out.println("TÍTULO: " + lv2.titulo);
        System.out.println("AUTOR: " + lv2.autor);
        System.out.println("PREÇO DE VENDA: R$" + lv2.preco);
        System.out.println("-------------------------------");
        System.out.println("TÍTULO: " + lv3.titulo);
        System.out.println("AUTOR: " + lv3.autor);
        System.out.println("PREÇO DE VENDA: R$" + lv3.preco);
        System.out.println("-------------------------------");
        System.out.println("TÍTULO: " + lv4.titulo);
        System.out.println("AUTOR: " + lv4.autor);
        System.out.println("PREÇO DE VENDA: R$" + lv4.preco);
        System.out.println("-------------------------------");
        System.out.println("TÍTULO: " + lv5.titulo);
        System.out.println("AUTOR: " + lv5.autor);
        System.out.println("PREÇO DE VENDA: R$" + lv5.preco);
    }
}

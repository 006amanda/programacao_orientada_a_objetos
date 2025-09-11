public class LojaApp {
    public static void main(String[] args) {

        // =================================
        Produto p1 = new Produto();
        p1.setNome("Arroz");
        p1.setPreco(5.0);
        p1.setQuantidade(10);


        // =================================
        Produto p2 = new Produto();
        p2.setNome("Tomate");
        p2.setPreco(3.0);
        p2.setQuantidade(20);


        // =================================
        Produto p3 = new Produto();
        p3.setNome("Batata");
        p3.setPreco(2.5);
        p3.setQuantidade(15);


        // =================================
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
        estoque.adicionarProduto(p3);

        System.out.println("Valor total inicial: " + estoque.valorTotalEmEstoque());

        estoque.movimentar("Arroz", 5, false);
        estoque.movimentar("Tomate", 10, true);
        estoque.movimentar("Batata", 15, true);

        System.out.println("Valor total final: " + estoque.valorTotalEmEstoque());


        // PRODUTO DE MAIOR VALOR
        // =================================
        Produto maior = p1;
        if (p2.valorTotal() > maior.valorTotal()) maior = p2;
        if (p3.valorTotal() > maior.valorTotal()) maior = p3;

        System.out.println("Produto de maior valor em estoque: "
                + maior.getNome() + "R$ " + maior.valorTotal());
    }
}

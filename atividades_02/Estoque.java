public class Estoque {
    private Produto[] produtos = new Produto[3];
    private int qtdProdutos = 0;


    public void adicionarProduto(Produto p) {
        if (p == null) return;
        for (int i = 0; i < qtdProdutos; i++) {
            if (produtos[i].getNome() == p.getNome()) return;
        }
        if (qtdProdutos < produtos.length) {
            produtos[qtdProdutos] = p;
            qtdProdutos++;
        }
    }


    // =================================
    public Produto buscarPorNome(String nome) {
        for (int i = 0; i < qtdProdutos; i++) {
            if (produtos[i].getNome() == nome) {
                return produtos[i];
            }
        }
        return null;
    }


    // =================================
    public double valorTotalEmEstoque() {
        double total = 0;
        for (int i = 0; i < qtdProdutos; i++) {
            total += produtos[i].valorTotal();
        }
        return total;
    }


    // =================================
    public boolean movimentar(String nome, int qtd, boolean entrada) {
        Produto p = buscarPorNome(nome);
        if (p == null) return false;
        if (entrada) {
            p.adicionar(qtd);
            return true;
        } else {
            if (qtd <= p.getQuantidade()) {
                p.remover(qtd);
                return true;
            }
        }
        return false;

    }
}

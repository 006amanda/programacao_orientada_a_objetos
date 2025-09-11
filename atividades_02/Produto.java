public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    // =================================
    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double p) {
        if (p >= 0) {
            this.preco = p;
        }
    }

    public void setQuantidade(int q) {
        if (q >= 0) {
            this.quantidade = q;
        }
    }


    // =================================
    public double valorTotal() {
        return preco * quantidade;
    }


    // =================================
    public void adicionar(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
        }
    }

    public void remover(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            this.quantidade -= qtd;
        }
    }
}

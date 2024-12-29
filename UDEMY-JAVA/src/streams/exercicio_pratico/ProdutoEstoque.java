package streams.exercicio_pratico;

public class ProdutoEstoque {
    private String nome;
    private double preco;
    private int quantidade;
    private String categoria;

    public ProdutoEstoque(String nome, double preco, int quantidade, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        Double total = this.preco * this.quantidade;
        return String.format("%s (%.2f x %d) Total - R$ %.2f - Categoria: %s", this.nome, this.preco, this.quantidade, total,this.categoria);
    }
}

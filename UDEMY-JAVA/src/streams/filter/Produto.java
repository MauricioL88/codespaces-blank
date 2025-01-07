package streams.filter;

public class Produto {
    public final String nome;
    public final Double preco;
    public final Double desconto;
    public final Double valorFrete;

    public Produto(String nome, Double preco, Double desconto, Double valorFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }

    public Double precoFinalDesconto() {
        Double result = this.preco * (1 - this.desconto);
        return result;
    }

    @Override
    public String toString() {
        return "Produto: "+this.nome+" | Preço Final com Desconto: R$ "+precoFinalDesconto()+
                " | Valor Final com Frete: R$ "+(precoFinalDesconto() + this.valorFrete);
    }
}

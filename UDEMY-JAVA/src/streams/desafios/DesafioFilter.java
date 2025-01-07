package streams.desafios;

import streams.filter.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        // Criando os objetos
        Produto p1 = new Produto("Lápis", 1.99, 0.05, 5.0);
        Produto p2 = new Produto("Caneta Azul", 5.99, 0.05, 5.0);
        Produto p3 = new Produto("Caderno", 19.99, 0.08, 9.99);
        Produto p4 = new Produto("Notebook", 2799.99, 0.1, 50.99);
        Produto p5 = new Produto("iPad", 3999.99, 0.1, 0.0);
        Produto p6 = new Produto("Monitor", 819.99, 0.09, 0.0);
        Produto p7 = new Produto("Smartwatch", 1999.99, 0.09, 0.0);

        // Criando a lista de objetos
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        // Gerando as interface funcionais para padronizar os resultados da stream
        Predicate<Produto> superPromocao = p -> p.desconto > 0.05;
        Predicate<Produto> freteGratis = p -> p.valorFrete == 0.0;
        Predicate<Produto> precoRelevante = p -> p.precoFinalDesconto() >= 300.0;

        Function<Produto, String> chamadaPromocional =
                p -> "Aproveite! "+p.nome+" por R$ "+p.preco+" reais!";

        // Gerando o resultado com a stream
        produtos.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .filter(precoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);

    }
}

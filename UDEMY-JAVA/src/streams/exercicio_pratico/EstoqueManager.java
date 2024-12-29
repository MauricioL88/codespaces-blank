package streams.exercicio_pratico;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EstoqueManager {
    public static void main(String[] args) {
        // Lista de produtos do estoque
        List<ProdutoEstoque> produtos = Arrays.asList(
                new ProdutoEstoque("Notebook", 3500.00, 10, "Eletrônicos"),
                new ProdutoEstoque("Mouse", 150.00, 50, "Preriféricos"),
                new ProdutoEstoque("Teclado", 200.00, 20, "Prefiréricos"),
                new ProdutoEstoque("Monitor", 1200.00, 5, "Eletrônicos"),
                new ProdutoEstoque("Cadeira Gamer", 800.00, 15, "Móveis"),
                new ProdutoEstoque("Celular", 2500.00, 8, "Eletrônicos")
        );

        // Filtrando produtos do estoque menor que 10 unidades.
        System.out.println("Produtos com o estoque baixo:");
        produtos.stream()
                .filter(prod -> prod.getQuantidade() < 10)
                .forEach(System.out::println);

        // Ordenando os produtos pelo preço em ordem crescente
        System.out.println("\nOrdenados por preço:");
        produtos.stream()
                .sorted(Comparator.comparingDouble(ProdutoEstoque::getPreco))
                .forEach(System.out::println);

        // Agrupando por categoria
        System.out.println("\nProdutos agrupados por categoria:");
        Map<String, List<ProdutoEstoque>> produtosPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(ProdutoEstoque::getCategoria));

        produtosPorCategoria.forEach(
                (categoria, prods) -> {
                    System.out.println("Categoria: "+categoria);
                    prods.forEach(System.out::println);
                });

        // Calculando o valor total do estoque
        Double valorTotalEstoque = produtos.stream()
                .mapToDouble(prod -> prod.getPreco() * prod.getQuantidade())
                .sum();

        System.out.printf("\nValor total do Estoque: %.2f%n\n", valorTotalEstoque);

        // Listando os nomes dos produtos da categoria Eletrônico
        System.out.println("\nProdutos da categoria \"Eletrônicos\":");
        List<String> nomesCategoria = produtos.stream()
                .filter(prod -> "Eletrônicos".equals(prod.getCategoria()))
                .map(ProdutoEstoque::getNome)
                .collect(Collectors.toList());

        nomesCategoria.forEach(System.out::println);
    }
}

package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        // Interface que recebe qualquer tipo da dado, porém retona "void".
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);

        Produto notebook = new Produto("Notebook", 2988.99, 0.15);
        Produto caneta = new Produto("Caneta", 4.99, 0.05);
        Produto caderno = new Produto("Caderno", 14.99, 0.08);
        Produto borracha = new Produto("Borracha", 2.5, 0.05);
        Produto lapis = new Produto("Lápis", 1.99, 0.05);

        List<Produto> produtos = Arrays.asList(notebook, caneta, caderno, borracha, lapis);

        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        // Chama o toString da classe Produto
        produtos.forEach(System.out::println);
    }
}

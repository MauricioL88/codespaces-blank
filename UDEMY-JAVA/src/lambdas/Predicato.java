package lambdas;

import java.util.function.Predicate;

public class Predicato {
    public static void main(String[] args) {
        // Inteface funcional que recebe qualquer tipo de Objeto e retorna um Boolean.
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750.0;

        Produto notebook = new Produto("Notebook", 3899.99, 0.25);

        System.out.println(isCaro.test(notebook));
    }
}

package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        // Interface flexível para que recebe qualquer tipo de entrada e retorna qualquer tipo de dado.
        // Abaixo uma função que recebe um dado do tipo Integer e retorna uma String.
        Function<Integer, String> parOuImpar = (numero) -> numero %2 == 0 ? "Par" : "Ímpar";

        System.out.println(parOuImpar.apply(1100));

        // Realizando composição de funções
        Function<String, String> resultado = (resp) -> "O resultado é "+resp;

        Function<String, String> conviccao = (valor) -> valor+" !!!";

        String result = parOuImpar.andThen(resultado).andThen(conviccao).apply(55);

        System.out.println(result);
    }
}

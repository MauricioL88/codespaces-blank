package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class FuncaoMap {
    public static void main(String[] args) {
        // Interface que recebe um tipo de dados e não retorna nenhum tipo
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ","Audi ","Mercerdes-Bens ","Honda ");

        // Built Operation -> Criação da Stream
        marcas.stream()
                .map(m -> m.toUpperCase()) // Operação intermediária
                .forEach(print); // Operação terminal

        // Composição de interfaces funcionais:

        // Recebe um tipo e retorna o mesmo tipo de dados
        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> gritando = n -> n + "!!!!";

    }
}

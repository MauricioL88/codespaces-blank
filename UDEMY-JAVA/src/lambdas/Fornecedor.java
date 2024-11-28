package lambdas;

import java.util.List;
import java.util.Arrays;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        // Interface que não recebe nenhum para parâmetro.
        Supplier<List<String>> umaLista = () -> Arrays.asList("Ana","Bia","Lia","Gui");

        // Exibição da como lista.
        System.out.println(umaLista.get());
    }
}

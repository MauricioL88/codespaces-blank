package lambdas;

import java.util.List;
import static java.util.Arrays.asList;

public class ForeachLambda1 {
    public static void main(String[] args) {
        List<String> aprovados = asList("Ana", "Lia", "Bia", "Gui");

        System.out.println("ForEach tradicional...");
        for(String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nForEach utilizando lambdas v.1");
        aprovados.forEach((nome) -> System.out.println(nome+"!!!"));

        System.out.println("\nAtravés do Method Reference...");
        // A referência é invocada através dos "::".
        aprovados.forEach(System.out::println);
    }
}

package lambdas;

import java.util.List;

import static java.util.Arrays.asList;

public class ForeachLambda2 {
    public static void main(String[] args) {
        List<String> aprovados = asList("Ana", "Lia", "Bia", "Gui");

        System.out.println("\nForEach utilizando lambdas v.2");
        aprovados.forEach((nome) -> meuImprimir(nome+"!!!"));

        System.out.println("\nAtravés do Method Reference, utilizando um método estático...");
        // A referência é invocada através dos "::".
        aprovados.forEach(ForeachLambda2::meuImprimir);
    }

    static void meuImprimir(String nome) {
        System.out.println("Olá! Meu nome é "+nome);
    }
}

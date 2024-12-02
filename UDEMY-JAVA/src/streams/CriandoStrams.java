package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStrams {
    public static void main(String[] args) {
        // Criando inteface para exibir os streams
        Consumer<String> printS = System.out::print;
        Consumer<Integer> printN = System.out::println;

        // Primeira forma de criar streams
        Stream<String> linguagens = Stream.of("Java ","Lua ","JS\n");
        // Exibindo...
        linguagens.forEach(printS);

        // Criando stream com array
        String[] maisLinguagens = {"Python ","Lisp ","Pearl ","Go\n"};

        // Criando streams com métodos estáticos
        Stream.of(maisLinguagens).forEach(printS);
        Arrays.stream(maisLinguagens).forEach(printS);
        // Delimitando a exibição de dados no stream
        Arrays.stream(maisLinguagens, 1, 4).forEach(printS);

        //Criando streams através de uma lista
        List<String> outrasLinguagens = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outrasLinguagens.stream().forEach(printS);
        // Exibição de forma paralela (alternada)
        outrasLinguagens.parallelStream().forEach(printS);

        // Iterando Streams de forma contínua
//        Stream.generate(() -> "a").forEach(printS);
//        Stream.iterate(0, n -> n + 1).forEach(printN);
    }
}

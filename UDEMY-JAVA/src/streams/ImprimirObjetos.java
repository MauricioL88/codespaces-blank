package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Luca","Gui","Ana","Bia","Zeca");

        // Iteração convencial da lista de objetos
        System.out.println("For tradicional:");
        for(int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }

        // Forma reduzida com forEach
        System.out.println("\nCom forEach:");
        for(String nome: aprovados) {
            System.out.println(nome);
        }

        // Usando o Iterator
        System.out.println("\nCom iterator:");
        // Interface funcional
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Usando o Stream
        System.out.println("\nCom Stream:");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);
    }
}

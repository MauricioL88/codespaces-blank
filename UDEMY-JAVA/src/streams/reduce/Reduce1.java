package streams.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Interface funcional para realizar o manipulação dos dados
        BinaryOperator<Integer> multiplicar = (ac, n) -> n * ac;
        BinaryOperator<Integer> somar = (ac, n) -> ac + n;

        // Reduce com saída optional de Integer, porque não há valor inicial no argumento da função reduce
        Integer totalOpicional = nums.stream().reduce(multiplicar).get(); // Multplicando por cada iteração
        System.out.println(totalOpicional);

        // Reduce com saída do tipo Integer
        Integer total = nums.parallelStream().reduce(2, multiplicar);
        System.out.println("\n"+total+"\n");

        nums.stream()
                .filter(n -> n > 5)
                .reduce(somar)
                .ifPresent(System.out::println);
    }
}

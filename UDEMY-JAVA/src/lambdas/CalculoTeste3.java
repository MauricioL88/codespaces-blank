package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        // Usando as interfaces funcionais originais do Java, sem necessidade de criar uma interface

        BinaryOperator<Double> calc = (a, b) -> {
            return a + b;
        };

        System.out.println(calc.apply(5.0, 25.0));
    }
}

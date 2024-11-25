package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = num -> num %2 == 0;
        Predicate<Integer> tresDigitos = num -> num >= 100 && num <= 999;

        //Composição de interface predicado
        System.out.println(isPar.and(tresDigitos).negate().test(123));
        System.out.println(isPar.or(tresDigitos).test(123));
    }
}

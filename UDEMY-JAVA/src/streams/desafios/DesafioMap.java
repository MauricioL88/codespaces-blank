package streams.desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        /*
        * 1 - Número para string binária... 6 => "110"
        * 2 - Inverter a string... "110" => "011"
        * 3 - Converter de volta para inteiro 6 => "110"
        *
        */

        nums.stream()
                .map(Integer::toBinaryString)
                .map(n -> new StringBuilder(n).reverse().toString())
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}

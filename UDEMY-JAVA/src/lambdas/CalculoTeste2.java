package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        // Operações lambdas
        Calculo somaAnonima = (a, b) -> {
          return a + b;
        };

        System.out.println(somaAnonima.executar(2, 5));

        Calculo somaReduzida = (a, b) -> a + b;

        System.out.println(somaReduzida.executar(25, 25));
    }
}

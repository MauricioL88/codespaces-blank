package lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        Calculo soma = new Somar();
        System.out.println("Somando: "+soma.executar(2,4));

        Calculo multiplicar = new Multiplicar();
        System.out.println("Multiplicando: "+multiplicar.executar(2, 25));
    }
}

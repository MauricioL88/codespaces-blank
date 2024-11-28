package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambdas {
    public static void main(String[] args) {

        Produto ipad = new Produto("Ipad", 3235.89, 0.06);

        // 1. A partir do produto, calcular o preço real (com desconto);
        Function<Produto, Double> precoDesconto = (prod) -> prod.preco * (1 - prod.desconto);
        // 2. Imposto Municipal - >= 2500 (8.5%) | < 2500 (Isento);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500.0 ? preco * 1.085 : preco;
        // 3. Frete - >= 3000 (100) | < 3000 (50);
        UnaryOperator<Double> frete = preco -> preco >= 3000.0 ? preco + 100.0 : preco + 50.0;
        // 4. Arredondar - Deixar duas casas decimais;
        UnaryOperator<Double> arredondar = preco -> Math.round(preco * 100.0) / 100.0;
        // 5. Formatar - R$ 1234,56;
        Function<Double, String> formatar = preco -> String.format("R$ %.2f reais", preco).replace(".",",");

        // Exibindo o resultado usando composição de interfaces funcionais
        String resultado = precoDesconto
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(ipad);

        System.out.println("O preço final do "+ipad.nome+" é de "+resultado);
    }
}

package cairu.listaatividade;

import java.util.Scanner;

/*
 *  Calcular a quantidade de dinheiro gasto por um fumante. Dados: o número de anos que
    ele fuma, o nº de cigarros fumados por dia e o preço de uma carteira.
 */

public class Fumante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe quantos anos fuma: ");
        int ano = entrada.nextInt();

        System.out.print("Informe o numero de cigarros fumados no dia: ");
        int qtdCigarro = entrada.nextInt();

        System.out.print("Qual o valor da carteira de cigarro: ");
        double precoCarteira = entrada.nextDouble();

        double vlrCigarro = precoCarteira / 20;
        double consumoCigarro = ((vlrCigarro * qtdCigarro) * 365) * ano;

        System.out.printf("\nO valor gasto com cigarros em %d anos foi de R$ %.2f reais.\n\n", ano, consumoCigarro);
        entrada.close();
    }
}

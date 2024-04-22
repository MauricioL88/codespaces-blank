package cairu.listaatividade;

import java.util.Scanner;

/**
 * Construa um algoritmo que calcula a quantidade de litros de combustível
 * gastos em uma
 * viagem utilizando-se um automóvel que faz 12 Km por litro. Para realizar esse
 * cálculo, o
 * usuário deverá fornecer o tempo gasto da viagem e a velocidade média durante
 * a
 * mesma. O algoritmo deverá apresentar como resultado os valores da velocidade
 * média,
 * tempo gasto na viagem, a distância percorrida e a quantidade de litros
 * utilizada na
 * viagem.
 */

public class ConsumoCombustivel {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quanto tempo (em horas) durou a viagem: ");
        double hr = entrada.nextDouble();

        System.out.print("Informe a velocidade media de viagem: ");
        double vel = entrada.nextDouble();

        double dist = vel * hr;
        double consL = dist / 12;

        System.out.println("\nA velocidade media: " + vel + " Km/h");
        System.out.println("A viagem durou " + hr + " horas");
        System.out.printf("A distancia pecorrida foi de: %.2f Km\n", dist);
        System.out.printf("A quantidade do combustivel consumido foi de %.2f litros.\n", consL);

        entrada.close();
    }
}
package cairu.listaatividade;

import java.util.Scanner;

/*
 *  Solicite a quantidade de bytes que um cliente deseja comprar e informe quantos
    quilobytes (Kbytes) equivale esta quantidade. Tenha cuidado para descobrir,
    exatamente, quantos bytes são um quilobyte, pois ele não corresponde a 1000 bytes.
 */

public class BytesKbytes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos bytes deseja comprar: ");
        long bytes = entrada.nextInt();

        double kbytes = bytes / 1024;

        System.out.println("\nA quantidade de "+bytes+" bytes equivale a "+kbytes+" quilobytes.");

        entrada.close();
    }
}

package cairu.listaatividade;

import java.util.Scanner;

/*
 *  Elabore um programa que lê 5 valores, um de cada vez, e conta quantos destes valores
    são negativos, quantos são positivos e quantos são zero, escrevendo esta informação.
 */

public class CincoValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[5];
        int numP = 0, numN = 0, numZ = 0;

        for(int i = 0; i < 5; i++) {
            System.out.print((i+1)+" - Digite um numero: ");
            num[i] = entrada.nextInt();
            if(num[i] > 0) {
                numP += 1;
            }else if (num[i] < 0) {
                numN += 1;
            }else {
                numZ += 1;
            }
        }

        System.out.println("\nQuantidade de numeros positivos: "+numP);
        System.out.println("Quantidade de numeros negativos: "+numN);
        System.out.println("Numero zero: "+numZ);
        
        entrada.close();
    }
}

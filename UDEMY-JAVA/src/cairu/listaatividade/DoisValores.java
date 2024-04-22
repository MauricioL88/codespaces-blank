package cairu.listaatividade;

import java.util.Scanner;

/**
 * Crie um programa que leia dois valores e efetue a troca dos mesmos
 */

public class DoisValores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int num2 = entrada.nextInt();

        int alt = num1;
        num1 = num2;
        num2 = alt;

        System.out.println("Primeiro numero digitado: "+num1);
        System.out.println("Segundo numero digitado: "+num2);
        
        entrada.close();
    }
}
package cairu.listaatividade;

import java.util.Scanner;

/**
 * Crie um programa que leia dois valores e escreva o resultado da multiplicação.
 */

public class DoisValoresMultiplicacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int num2 = entrada.nextInt();
        
        int result = num1 * num2;

        System.out.println("O resultado da multiplicacao eh: "+ result);
        
        entrada.close();
    }
}
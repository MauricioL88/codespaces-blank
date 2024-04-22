package oo.cairu.exemplo1;

import java.util.Scanner;

public class Calculador {
    public static void main(String[] args) {

        escolha();
    }

    public static void escolha() {
        Scanner entrada = new Scanner(System.in);
        Calculadora hp = new Calculadora();

        System.out.print("Digite um numero inteiro: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite um outro numero inteiro: ");
        int num2 = entrada.nextInt();

        System.out.print("Digite a operacao que deseja calcular (+|-|*|/): ");
        String op = entrada.next();
        System.out.println("\n");

        hp.calcular(op, num1, num2);

        entrada.close();
    }
}

package oo.cairu.exemplo1;

public class Calculadora {

    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public int dividir(int num1, int num2) {
        return num1 / num2;
    }

    public void calcular(String esc, int num1, int num2) {
        switch (esc) {
            case "+":
                System.out.println("Resultado da soma: " + somar(num1, num2) + "\n");
                break;
            case "-":
                System.out.println("Resultado da subtracao: " + subtrair(num1, num2) + "\n");
                break;
            case "*":
                System.out.println("Resultado da multiplicacao: " + multiplicar(num1, num2) + "\n");
                break;
            case "/":
                System.out.println("Resultado da divisao: " + dividir(num1, num2) + "\n");
                break;
            default:
                System.out.println("Digite a informacao correta!\n");
                break;
        }
    }
}

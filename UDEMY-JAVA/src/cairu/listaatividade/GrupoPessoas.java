package cairu.listaatividade;

import java.util.Scanner;

/*
 *  Tem-se um conjunto de dados de um grupo de pessoas, serão coletados a altura e o
    sexo (1- masculino, 2 - feminino). O final do conjunto é determinado quando for
    informada uma altura menor ou igual a zeros. Imprima:
        a) a maior e a menor altura do grupo;
        b) o número de homens;
        c) a média de altura das mulheres;
        d) o percentual de mulheres abaixo de 1,68. 
 */

public class GrupoPessoas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mascM = 0.0, mascMe, femM, FemMe;
        int qtdH = 0, qtdTm = 0, qtdM = 0;

        System.out.print("Digite o seu sexo: 1 - Masculino | 2 - Feminino: ");
        int sexo = entrada.nextInt();
        System.out.println("\n");
        
        switch(sexo) {
            case 1: {
                qtdH += 1;
                System.out.print("Digite a sua altura: ");
                double alt = entrada.nextDouble();
                if(alt > mascM) {
                    mascM = alt;
                }else {
                    mascMe = alt;
                }
                break;
            }
        }

        entrada.close();
    }
}

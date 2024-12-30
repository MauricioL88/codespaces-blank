package colecoes.map.projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDicionario {
    public static void main(String[] args) {
        DicionarioSeeds dicionario = new DicionarioSeeds();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite suas palavras BIP-39 (12 a 24 palavras), separadas por espaço:");
        String input = entrada.nextLine();
        String[] seeds = input.trim().split("\\s+");

        if(seeds.length < 12 || seeds.length > 24) {
            System.out.println("Erro: Você de inserir entre 12 e 24 palavras.");
            entrada.close();
        }

        List<Integer> seedNumbers = new ArrayList<>();
        boolean allWordsValid = true;

        for(String seed : seeds) {
            Integer number = dicionario.getChaveApartirDeValor(seed);
            if(number == null) {
                System.out.println("Erro: A palavra '"+ seed +"' não é válida no dicionário BIP-39.");
                allWordsValid = false;
                break;
            }
            seedNumbers.add(number);
        }

        if(allWordsValid) {
            System.out.println("Sequência de números correspondente:");
            seedNumbers.forEach(num -> System.out.println(num + " "));
        }

        entrada.close();
    }
}

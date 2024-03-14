package colecoes.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

class MapPrincipal {
    public static void main(String[] args) {
        Map<Integer, Piloto> bancoDados = new HashMap<>(); // Declaração

        System.out.println("Banco vazio: "+bancoDados.isEmpty());
        bancoDados.put(1, new Piloto("Mauricio", 35, "Brasileiro"));

        System.out.println("Banco vazio: "+bancoDados.isEmpty());
        System.out.println(bancoDados.size());
        System.out.println(bancoDados.values()); // Exibe em lista

        bancoDados.put(2, new Piloto("Evelin", 30, "Brasileira"));

        System.out.println(bancoDados.size());
        System.out.println(bancoDados.values());

        System.out.println();
        System.out.println(bancoDados.get(1));
        
        System.out.println();
        // Percorrendo chaves ou valores com o laço "for"
        System.out.println("Chaves:");
        for(int chave: bancoDados.keySet()) {
            System.out.println(chave);
        }        
        
        System.out.println();
        System.out.println("Valores:");
        for(Piloto valor: bancoDados.values()) {
            System.out.println(valor);
        }        
        
        System.out.println();
        System.out.println("Chave e Valores:");
        for(Entry<Integer, Piloto> tupla: bancoDados.entrySet()) {
            System.out.println(tupla);
        }        
        
        System.out.println();
        System.out.println("Chave e Valores:");
        for(Entry<Integer, Piloto> tupla: bancoDados.entrySet()) {
            System.out.println(tupla.getKey());
            System.out.println(tupla.getValue());
            System.out.println();
        }        
    }
}
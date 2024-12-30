package colecoes.map.projeto;

import java.util.HashMap;
import java.util.Map;

public class DicionarioSeeds {
    private Map<Integer, String> seedMap;

    public DicionarioSeeds() {
        this.seedMap = new HashMap<>();
        loadSeeds();
    }

    private void loadSeeds() {
        // Adicionar as 2048 palavras referentes ao BIP-39
        seedMap.put(1,"abandon");
        seedMap.put(2,"ability");
        seedMap.put(3,"able");
        seedMap.put(4,"about");
        seedMap.put(5,"above");
        seedMap.put(6,"absent");
        seedMap.put(7,"absorb");
        seedMap.put(8,"abstract");
        seedMap.put(9,"absurd");
        seedMap.put(10,"abuse");
        seedMap.put(11,"access");
        seedMap.put(2048,"zoo");
    }

    public Integer getChaveApartirDeValor(String valor) {
        for(Map.Entry<Integer, String> entry : seedMap.entrySet()) {
            if(entry.getValue().equals(valor)) {
                return entry.getKey();
            }
        }
        return null; // Retornando nulo se a palavra não for encotrada
    }

    public String getValorApartirDaChave(Integer chave) {
        return seedMap.get(chave);
    }
}

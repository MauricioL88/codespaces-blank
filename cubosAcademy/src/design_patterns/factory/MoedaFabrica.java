package design_patterns.factory;

public class MoedaFabrica {
    public static Moeda getInstance(String siglaPais) {
        switch (siglaPais) {
            case "BR": return new Real();
            case "EUA": return new Dolar();
            default: throw new IllegalArgumentException("País não encontrado!");
        }
    }
}

package design_patterns.factory;

public class Dolar implements Moeda{
    @Override
    public String getPrefixo() {
        return "$";
    }
}

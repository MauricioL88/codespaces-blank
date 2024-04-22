package oo.composicao.desafio1;

public class TerminalVenda {
    public static void main(String[] args) {
        Cliente mauricio = new Cliente("Mauricio Lisboa");

        mauricio.efetuarCompra("Caneta Azul", 0.65, 100);
        mauricio.efetuarCompra("Borracha", 0.80, 50);
        mauricio.efetuarCompra("Lápis", 0.40, 100);

        System.out.println(mauricio.obterValorTotal());
    }
}

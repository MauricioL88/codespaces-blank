package oo.composicao.desafio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void efetuarCompra(String nomeProduto, double preco, int qtd) {
        Compra compra = new Compra();
        compra.adicionarItem(nomeProduto, preco, qtd);
        compras.add(compra);
    }
    
    double obterValorTotal() {
        double total = 0;
        for(Compra compra: compras) {
            total += compra.obterValorTotal();
        }
        return total;
    }
}

package oo.composicao.desafio1;

public class Item {
    int qtd;
    Produto produto;

    Item(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }
}

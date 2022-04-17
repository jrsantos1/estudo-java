package br.com.edu.aulas.oo.relacoes.desafio;

import java.util.ArrayList;
import java.util.List;

public class Item {
    int qtd;
    List<Produto> produtos = new ArrayList<Produto>();

    Item(int qtd, Produto produto){
        this.qtd = qtd;
        this.produtos.add(produto);
    }

}

package br.com.edu.topicos.orientacao_objeto.relacoes.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    Cliente cliente;
    List<Item> itens = new ArrayList<Item>();
    double valorTotal;

    Compra(Cliente cliente){
        this.cliente = cliente;
    }

    void adicionarItem(Item item){
        this.itens.add(item);
    }

    double retornarValorTotal(){
        for (Item itens: this.itens){
            this.valorTotal += itens.produtos.get(0).preco * itens.qtd;
        }
        return this.valorTotal;
    }

}

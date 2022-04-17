package br.com.edu.aulas.oo.relacoes.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Compra> compra = new ArrayList<Compra>();

    public void adicionarCompra(Compra compra){
        this.compra.add(compra);
    }

}

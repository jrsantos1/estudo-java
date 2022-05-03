package br.com.edu.aulas.generics;

import java.util.SortedSet;
import java.util.TreeSet;

public class GenericsPares<C extends Number, V> {

    private SortedSet<GenericsPar<C, V>> itens = new TreeSet<>();

    public void adicionar(C chave, V valor){
        if(chave == null) return;

        GenericsPar<C, V> novoPar = new GenericsPar<C, V>(chave, valor);

        if(itens.contains(novoPar)){
            itens.remove(novoPar);
        }

        itens.add(novoPar);

    }

}

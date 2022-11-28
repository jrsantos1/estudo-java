package br.com.edu.topicos.fundamentos.listas.collections.arraylist.ordenacao_objetos.compator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class OrdenacaoProduto implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        if (o1.price > o2.price){
            return -1;
        }else if(o1.price < o2.price){
            return 1;
        }else {
        return 0;
        }
    }
}
public class Produto {
    String nome;
    Double price;
    public Produto(String nome, Double price){
        this.nome = nome;
        this.price = price;
    }
    @Override
    public String toString() {
        return this.nome + " " + this.price;
    }
}

class Main{
    public static void main(String[] args) {

        Produto maca = new Produto("Maca", 19.23);
        Produto caqui = new Produto("caqui", 25.23);
        Produto pessego = new Produto("pessego", 36.23);
        Produto banana = new Produto("banana", 5.23);
        Produto pudim = new Produto("pudim", 1.23);

        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(maca);
        produtos.add(caqui);
        produtos.add(pessego);
        produtos.add(banana);
        produtos.add(pudim);

        Comparator<? super Produto> OrdenacaoProduto = new OrdenacaoProduto();
        // produtos.sort(OrdenacaoProduto);

        Collections.sort(produtos, OrdenacaoProduto);

        System.out.println(produtos);


    }
}

package br.com.edu.aulas.ap02.exercicios_em_sala.exercicio_em_sala_3;

import java.util.ArrayList;
import java.util.Scanner;

class CaixaMercado {

    public ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void addProduto(Produto produto){
        this.listaProdutos.add(produto);
    } 
    public void imprimirSubTotal(ArrayList<Produto> listaProdutos){
        int qtd = 0;
        double preco = 0;
        ArrayList<Produto> listaProdutosNovo = listaProdutos;
        
        for (Produto produto : listaProdutosNovo) {
            qtd += produto.getQtd();
            preco += produto.getPreco();
        }
        System.out.printf("(%d itens) - SubTotal: R$ %f", qtd, preco);
        System.out.println();
    }
}




package br.com.edu.topicos.orientacao_objeto.relacoes.desafio;

public class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

}

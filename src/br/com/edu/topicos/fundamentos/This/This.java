package br.com.edu.topicos.fundamentos.This;

public class This {
    private int idade;
    private String nome;
    public static int qtd;

    This(int idade, String nome){
        this.idade = idade;
        this.nome = nome;

        qtd++;
    }


}

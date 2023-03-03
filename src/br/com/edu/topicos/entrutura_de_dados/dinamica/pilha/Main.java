package br.com.edu.topicos.entrutura_de_dados.dinamica.pilha;

public class Main {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();

        minhaPilha.push(1);
        minhaPilha.push(2);
        minhaPilha.push(3);
        minhaPilha.push(4);
        minhaPilha.push(5);
        minhaPilha.pop();

        System.out.println(minhaPilha.toString());
    }
}

package br.com.edu.topicos.entrutura_de_dados.dinamica.fila;

public class No<T> {
    private T conteudo;
    private No noRef;

    public No(T conteudo){
        this.noRef = null;
        this.conteudo = conteudo;
    }

    public No(){}

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getNoRef() {
        return noRef;
    }

    public void setNoRef(No noRef) {
        this.noRef = noRef;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}

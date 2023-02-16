package br.com.edu.topicos.entrutura_de_dados.dinamica.pilha;

public class No {
    private int conteudo;
    private No reNo;

    public No(int conteudo) {
        this.conteudo = conteudo;
    }

    public No(){}

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public No getReNo() {
        return reNo;
    }

    public void setReNo(No reNo) {
        this.reNo = reNo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }
}

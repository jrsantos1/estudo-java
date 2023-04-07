package br.com.edu.topicos.entrutura_de_dados.dinamica.lista_duplamente_encadeada;

import br.com.edu.topicos.entrutura_de_dados.dinamica.listaEncadeada.No;

public class NoDuplo<T> {

    private T conteudo;
    NoDuplo<T> proximoNo;
    NoDuplo<T> noAnterior;

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    public NoDuplo(){};

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoDuplo<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    public NoDuplo<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(NoDuplo<T> noAnterior) {
        this.noAnterior = noAnterior;
    }
}

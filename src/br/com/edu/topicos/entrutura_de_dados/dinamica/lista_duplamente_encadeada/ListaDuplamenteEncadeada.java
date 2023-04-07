package br.com.edu.topicos.entrutura_de_dados.dinamica.lista_duplamente_encadeada;

import br.com.edu.topicos.entrutura_de_dados.dinamica.listaEncadeada.No;

public class ListaDuplamenteEncadeada <T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.ultimoNo = null;
        this.primeiroNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index){

        NoDuplo<T> noAuxiliar = this.primeiroNo;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noAuxiliar;

    }

    public boolean isEmpty(){
        return this.primeiroNo == null? true: false;
    }


    public int size(){
        return this.tamanhoLista;
    }

}

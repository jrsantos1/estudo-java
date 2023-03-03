package br.com.edu.topicos.entrutura_de_dados.dinamica.listaLigada;

import java.io.ObjectStreamException;

public class Celula {

    private Celula proximo;
    private Celula ultima;
    private Object elemento;

    public Celula(Celula proximo, Object elemento){
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Celula(Object elemento){
        this.elemento = elemento;
    }

    public void setProxima(Celula proxima){
        this.proximo = proxima;
    }

    public Celula getProxima(){
        return this.proximo;
    }

    public Object getElement(){
        return elemento;
    }

}

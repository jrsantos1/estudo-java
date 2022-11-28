package br.com.edu.topicos.generics;

public class Caixa<X> {
    private X coisa;

    public void guardar(X objeto){
        this.coisa = objeto;
    }
    public Object setObj(){
        return this.coisa;
    }

}

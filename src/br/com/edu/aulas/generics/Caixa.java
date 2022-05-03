package br.com.edu.aulas.generics;

public class Caixa<X> {
    private X coisa;

    public void guardar(X objeto){
        this.coisa = objeto;
    }
    public Object setObj(){
        return this.coisa;
    }

}

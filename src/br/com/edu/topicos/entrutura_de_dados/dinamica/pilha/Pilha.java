package br.com.edu.topicos.entrutura_de_dados.dinamica.pilha;

public class Pilha {
    private No refNoEntrada;

    public Pilha(){
        refNoEntrada = null;
    }

    public No pop(){
        if(!this.isEmpty()){
            No nopoped = refNoEntrada;
            refNoEntrada = refNoEntrada.getReNo();
            return nopoped;
        }

        return null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntrada;
        refNoEntrada = novoNo;
        refNoEntrada.setReNo(refAuxiliar);
    }

    public No top(){
        return this.refNoEntrada;
    }

    public boolean isEmpty(){
        return this.refNoEntrada == null? true: false;
    }

    @Override
    public String toString() {

        No refNoAux = refNoEntrada;
        //StringBuilder sb = new StringBuilder();

        String saida = "";

        //sb.append("[");
        saida += "[";

        while(true){
            if(refNoAux != null){
                saida += "{conteudo: " + refNoAux.getConteudo() + "}";
                refNoAux = refNoAux.getReNo();
            }else{
                break;
            }}

        //sb.append("]");
        saida += "]";

        return saida;

    }
}

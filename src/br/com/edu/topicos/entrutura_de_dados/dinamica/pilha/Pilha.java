package br.com.edu.topicos.entrutura_de_dados.dinamica.pilha;

public class Pilha {

    // no referencia de entrada na pilha, le-se de cima para baixo
    private No refNoEntrada;

    public Pilha(){
        refNoEntrada = null;
    }

    // remove último elemento da pilha
    public No pop(){
        if(!this.isEmpty()){
            No nopoped = refNoEntrada;
            refNoEntrada = refNoEntrada.getReNo();
            return nopoped;
        }
        return null;
    }

    public void push(int conteudo){
        No novoNo = new No(conteudo);
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

package br.com.edu.topicos.entrutura_de_dados.dinamica.listaEncadeada;

import br.com.edu.topicos.entrutura_de_dados.estatica.Lista;

public class ListaEncadeada<T> {

     No<T> refEntrada;

     ListaEncadeada(){
         this.refEntrada = null;
     }

     public boolean add(T conteudo){
        No<T> novoNo = new No(conteudo);
        if(this.isEmpty()){
            refEntrada = novoNo;
            return true;
        }
        try{
         No refAux = refEntrada;
         for (int i = 0; i < size() - 1; i++) {
             refAux = refAux.getProximoNo();
         }
         refAux.setProximoNo(novoNo);
         return true;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
     }

     public T get(int index ){
         return getNo(index).getConteudo();
     }

     public T remove(int index){
         No<T> noPivor = getNo(index);

         if (index == 0){
             refEntrada = noPivor.getProximoNo();
             return noPivor.getConteudo();
         }

         No<T> noAnterior = getNo(index - 1);
         noAnterior.setProximoNo(noPivor.getProximoNo());
         return noPivor.getConteudo();

     }
     private No<T> getNo(int index){

         if (index >= (size() - 1)){
             throw new IndexOutOfBoundsException("O índex solicitado não está presente na lista, lista só vai até o índice");
         }

         No noAuxiliar = refEntrada;

         if (this.isEmpty())
             return null;

         int contador = 0;
         while (contador <= index){
             //TODO verificar necessidade de criar um nó de retorno
             noAuxiliar = noAuxiliar.getProximoNo();
         }
         return noAuxiliar;
     }

     public int size(){
         int tamanhoLista = 0;
         No<T> refAuxiliar = refEntrada;
         while(true){
             if (refAuxiliar != null) {
                  tamanhoLista++;
                  if(refAuxiliar.getProximoNo() == null){
                      refAuxiliar = refAuxiliar.getProximoNo();
                  }
             }else {
                 break;
             }
         }
         return tamanhoLista;
     }

     public boolean isEmpty(){
         return  refEntrada == null? true: false;
     }

}

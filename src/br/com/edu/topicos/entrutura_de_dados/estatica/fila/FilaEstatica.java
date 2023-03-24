package br.com.edu.topicos.entrutura_de_dados.estatica.fila;

public class FilaEstatica<T> {

    private int len = 0;
    private T[] vetor = (T[]) new Object[10];
    public FilaEstatica(){
        vetor[len] = null;
    }
    boolean isEmpty(){
        return len == 0;
    }

    void enqueue(T value){
        this.vetor[len] = value;
        this.len++;
    }

    public int lenght(){
        return this.len;
    }

    public T peak(){
        boolean vazio = !isEmpty();
        if(!isEmpty()){
            return vetor[lenght() - 1];
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public T dequeue(){
        T value;
        if (isEmpty()){
            throw new RuntimeException("A lista está vazia");
        }else{
            value = vetor[0];
            for (int i = 0; i < lenght() - 1; i++) {
                T tempValue = vetor[1+i];
                vetor[i] = tempValue;
                vetor[i+1] = null;
            }
        }
        if (len == 0){
        }else{
            len--;
        }
        return value;
    }

    @Override
    public String toString(){

        String strBuilder = "";

        for (int i = 0; i < lenght(); i++) {
            strBuilder += "[" + i + "=" + vetor[i] + "]";
        }

        return strBuilder;
    }

}

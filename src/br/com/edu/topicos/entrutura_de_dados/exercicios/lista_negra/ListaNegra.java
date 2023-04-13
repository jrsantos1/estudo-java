package br.com.edu.topicos.entrutura_de_dados.exercicios.lista_negra;


public class ListaNegra<T> {
    private T[] elements;
    private int size = -1;

    public ListaNegra(int elements){
        this.elements = (T[]) new Object[50];
    }

    public T add(T element){
        if(!isEmpty()){
            for (T elemento: elements){
                if(elemento == null){
                    break;
                }
                if (elemento.equals(element)){
                    throw new IllegalArgumentException("O elemento já existe na lista negra");
                }
            }
        }
        size++;
        elements[size] = element;
        return element;
    }

    public void remove(T element){
        if(!isEmpty()){
            for (int i = 0; i < size; i++) {
                if(exists(this.elements[i]) > -1){
                    for (int j = i; j < size; j++) {
                        this.elements[i] = this.elements[i+1];
                    }
                    size--;
                    System.out.println("Removido com sucesso");
                    break;
                }
            }
        }
    }

    public int len(){
        return this.size + 1;
    }

    // retorna a posicao se verdadeira, se falso retorna -1

    public int exists(T element){
        if(!isEmpty()){
            for (int i = 0; i < size; i++) {
                if(this.elements[i].equals(element)){
                    return i;
                }
            }
            return -1;
        }
        throw new RuntimeException("A lista está vazia");
    }

    public boolean isEmpty(){
        if (size < 0){
            return true;
        }else {
            return false;
        }

    }

    public String toString(){
        String strBuilder = "[";

        if(!isEmpty()){
            for (T element : this.elements) {
                if (element == null){
                    break;
                }
                strBuilder += element + ",";
            }
            strBuilder = strBuilder.substring(0, strBuilder.length());
            return strBuilder;
        }
        throw new RuntimeException("A lista não pode estar vazia");
    }
}

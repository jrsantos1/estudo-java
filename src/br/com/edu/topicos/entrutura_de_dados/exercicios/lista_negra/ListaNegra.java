package br.com.edu.topicos.entrutura_de_dados.exercicios.lista_negra;

import br.com.edu.topicos.fundamentos.listas.List;

public class ListaNegra {
    String[] elements;
    int size = -1;

    public ListaNegra(int elements){
        this.elements = new String[50];
    }

    public String add(String element){
        if(!isEmpty()){
            for (String elemento: elements){
                if (elemento.equals(element)){
                    throw new IllegalArgumentException("O elemento já existe na lista negra");
                }
            }
        }
        size++;
        elements[size] = element;
        return element;
    }

    public String remove(String element){
        if(!isEmpty()){
            for (int i = 0; i < size; i++) {
                if(exists(this.elements[i]) > -1){
                    for (int j = i; j < size; j++) {
                        this.elements[i] = this.elements[i+1];
                    }
                    size--;
                    break;
                }
            }
        }
        return "";
    }

    public int len(){
        return this.size;
    }

    // retorna a posicao se verdadeira, se falso retorna -1

    public int exists(String element){
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
            for (String element : this.elements) {
                strBuilder += element + ",";
            }
            strBuilder = strBuilder.substring(0, strBuilder.length());

            return strBuilder;
        }

        throw new RuntimeException("A lista não pode estar vazia");
    }
}

package br.com.edu.topicos.fundamentos.listas;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    // implementa fila
    // last in / fist out
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();
        fila.add("Ana"); // adiciona elemento na fila, se cheia joga um erro
        fila.offer("Cleber"); // adiciona um elemnto na fila, se não returna false
        fila.add("Jurassa");
        fila.add("Manu");

        System.out.println(fila.peek()); // retorna false se a fila vazia
        System.out.println(fila.element()); // retorna excecao se a fila estiver vazia

        for(String lista: fila){
            System.out.println(lista);
        }
    }

}

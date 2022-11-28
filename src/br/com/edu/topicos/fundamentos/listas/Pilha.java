package br.com.edu.topicos.fundamentos.listas;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Harry Potter e a Pedra Filosofal"); // retorna false se array for fazio
        livros.push("O Hobbit");
        livros.push("Batman");

        System.out.println(livros.getFirst());

    }
}

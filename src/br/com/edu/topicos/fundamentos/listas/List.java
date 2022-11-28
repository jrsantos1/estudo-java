package br.com.edu.topicos.fundamentos.listas;

import java.util.ArrayList;
import java.util.Objects;

public class List {
    String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List list = (List) o;
        return Objects.equals(nome, list.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public static void main(String[] args) {
        ArrayList<List> usuaraio = new ArrayList<List>();

    }
}

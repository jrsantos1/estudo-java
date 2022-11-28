package br.com.edu.topicos.fundamentos.listas.collections.arraylist;

import java.util.*;

public class Ordenacao {
    public static void main(String[] args) {
        ArrayList<String> listaCarros = new ArrayList<>();

        listaCarros.add("Chevrolet");
        listaCarros.add("Volkswagen");
        listaCarros.add("Fiat");
        listaCarros.add("Renault");

        Collections.sort(listaCarros, Collections.reverseOrder());

        System.out.println(listaCarros);

    }
}

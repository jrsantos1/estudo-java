package br.com.edu.topicos.fundamentos.listas.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoReversa {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(5);
        numeros.add(8);
        numeros.add(2);

        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println(numeros.contains(3));

        System.out.println(numeros);

    }
}

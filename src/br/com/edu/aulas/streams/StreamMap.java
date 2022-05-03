package br.com.edu.aulas.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMap {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(3);
        numeros.add(5);
        numeros.add(3);
        numeros.add(4);
        numeros.add(6);

        numeros.stream().map(n -> n*2).forEach(System.out::println);

    }
}

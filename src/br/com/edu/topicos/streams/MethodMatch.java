package br.com.edu.topicos.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MethodMatch {
    public static void main(String[] args) {

        List<Integer> idades = Arrays.asList(23,45,34,61,24,34,15,14,4);

        Predicate<Integer> aprovador = n -> n > 17;

        Boolean aprovado = idades.stream().anyMatch(aprovador);
        System.out.println(aprovado);




    }
}

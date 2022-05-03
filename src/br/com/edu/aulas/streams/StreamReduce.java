package br.com.edu.aulas.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {

        List<Integer> inteiros = Arrays.asList(1,2,3,4,5,6,7,8,10);
        String resultado = inteiros.stream().reduce((a , n) -> a + n ).toString();
        System.out.println(resultado);
    }
}

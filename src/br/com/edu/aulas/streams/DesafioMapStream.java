package br.com.edu.aulas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMapStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,4,5,7,3,4);

        Function<Integer, String>  converteEmBinario = n -> Integer.toBinaryString(n);
        //nums.stream().map(converteEmBinario).forEach(n -> System.out.println("O tipo do parametro é " + n.getClass()));
        UnaryOperator<String> inverte = n -> new StringBuilder(n).reverse().toString();
        Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
//
          nums.stream().map(converteEmBinario)
                .map(inverte)
                  .map(binarioParaInt).forEach(System.out::println);
    }
}

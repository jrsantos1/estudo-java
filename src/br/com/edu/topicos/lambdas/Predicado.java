package br.com.edu.topicos.lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        // retorna true ou false, recebe um valor de qualquer valor

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        //composicao de funcao exemplo 1; clausula and

        System.out.println(isPar.and(isTresDigitos).test(123));

        // composicao de funcao, exemplo 2; Clausula and e negate

        System.out.println(isPar.and(isTresDigitos).negate().test(22));

        // composicao de funcao, exemplo 2; clausula Or

        System.out.println(isPar.or(isTresDigitos).negate().test(22));
    }
}

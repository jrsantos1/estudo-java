package br.com.edu.aulas.lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> parOuImpart = n -> n % 2 == 0? "É par": "É impar";

        System.out.println(parOuImpart.apply(30));

        Function<String, String> oResultadoE = valor -> "O Resultado é " + valor;

        String resultadoFinal = parOuImpart.andThen(oResultadoE).apply(23);

        System.out.println(resultadoFinal);


    }
}

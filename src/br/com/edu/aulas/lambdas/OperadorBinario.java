package br.com.edu.aulas.lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> media = (x, y) -> (x + y) / 2;

        BiFunction<Double, Double, String> resultado = (n1, n2) ->{
            double notaFinal = (n1 + n2) / 2;
            return notaFinal >= 7? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(9.7, 4.1));

        Function<Double, String> conceito = m -> m >= 7? "Aprovador" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(7.0, 8.9));
    }
}

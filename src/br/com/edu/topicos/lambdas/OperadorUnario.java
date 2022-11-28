package br.com.edu.topicos.lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n+2;
        UnaryOperator<Integer> vezesDois = n -> n*2;
        UnaryOperator<Integer> aoQuadro = n -> n*n;

        System.out.println(maisDois.andThen(vezesDois).andThen(aoQuadro).apply(0));

        // metodo compose

        int resultadoCompose = aoQuadro.compose(vezesDois).compose(maisDois).apply(0);

    }
}

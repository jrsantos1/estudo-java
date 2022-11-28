package br.com.edu.topicos.lambdas;

import java.util.function.BinaryOperator;

public class TesteCalculo {

    public static void main(String[] args) {

        Calculo cal = (x, y) -> y + x;
        double resulado = cal.executar(2,3);
        System.out.println(resulado);

        BinaryOperator<Double> calc = (a, b) -> a+b;

        System.out.println(calc.apply(2.0, 2.3));
    }


}

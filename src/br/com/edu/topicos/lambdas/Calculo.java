package br.com.edu.topicos.lambdas;

public interface Calculo {
    double executar(double a, double b);

    static String retornaText(){
        return "muito legal";
    }
}

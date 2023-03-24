package br.com.edu.topicos.orientacao_objeto.matematica.exercicio_em_sala;

public class Divisao<T> extends Matematica{


    public void qlr(){
        System.out.println("Teste");
    }

    @Override
    public double calcular(double a, double b) {
        if (b == 0.0){
            throw new IllegalArgumentException("O valor de b não pode ser igual a 0");
        }
        return a / b;
    }
}

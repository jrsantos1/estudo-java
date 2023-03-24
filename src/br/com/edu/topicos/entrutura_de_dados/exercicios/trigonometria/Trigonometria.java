package br.com.edu.topicos.entrutura_de_dados.exercicios.trigonometria;

public class Trigonometria {

    public double area(Retangulo retangulo){
        double base = retangulo.getBase();
        double altura = retangulo.getAltura();
        return base * altura;
    }

    public double area(Triangulo triangulo){
        double base = triangulo.getBase();
        double altura = triangulo.getAltura();
        return (base * altura) / 2;
    }
}

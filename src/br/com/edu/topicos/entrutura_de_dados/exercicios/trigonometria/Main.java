package br.com.edu.topicos.entrutura_de_dados.exercicios.trigonometria;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(10,10);
        Triangulo triangulo = new Triangulo(10,10);

        Trigonometria trigonometria = new Trigonometria();

        System.out.println(trigonometria.area(retangulo));
        System.out.println(trigonometria.area(triangulo));

    }
}

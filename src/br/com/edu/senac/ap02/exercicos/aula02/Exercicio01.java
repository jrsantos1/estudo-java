package br.com.edu.senac.ap02.exercicos.aula02;

public class Exercicio01 {
    public static void main(String[] args) {

        int numero = calcular(5);

        System.out.println(numero);
    }

    public static int calcular(int n){

        int resultado = 1;

        for (int i = 0; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

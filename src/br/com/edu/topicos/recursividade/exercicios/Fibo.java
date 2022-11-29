package br.com.edu.topicos.recursividade.exercicios;

public class Fibo {
    public static int fibonacci(int numFatorial){
        if (numFatorial == 0){
            return 1;
        }
        return numFatorial * fibonacci(numFatorial - 1);
    }
}

class main  {
    public static void main(String[] args) {
        int resultado = Fibo.fibonacci(5);
        System.out.println(resultado);
    }
}



package br.com.edu.topicos.recursividade.exercicios;

class Fibo {
    public static long fibonacci(int n) {

        return n < 2 ? n : fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
//        }



    }
}

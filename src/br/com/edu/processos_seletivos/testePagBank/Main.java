package br.com.edu.processos_seletivos.testePagBank;

public class Main {
    public static void main(String[] args) {
        System.out.println("fizzBuzz");   
        int numero = 1;
       if (numero % 3 == 0 & numero % 5 == 0){
        System.out.println("fizzBuzz");   
        }
        if ( numero % 5 == 0 & ! (numero % 5 == 0)){
        System.out.println("Buzz");   
        }
        if ( numero % 3 == 0 & !(numero % 5 == 0)){
        System.out.println("Fizz");   
        }
        if ( !(numero % 3 == 0 )| !(numero % 5 == 0)){
        System.out.println(numero);   
        }

    }
    
}

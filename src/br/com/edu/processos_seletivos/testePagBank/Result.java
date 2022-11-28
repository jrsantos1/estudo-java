package br.com.edu.processos_seletivos.testePagBank;

import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 & i % 5 == 0){
                System.out.println("fizzBuzz");   
            }
            if ( i % 5 == 0 & !(i % 3 == 0)){
                System.out.println("Buzz");   
            }
            if ( i % 3 == 0 & !(i % 5 == 0)){
                System.out.println("Fizz");   
            }
            if ( !(i % 3 == 0) & !(i % 5 == 0)){
                System.out.println(i);   
            }
        } 
    }

}



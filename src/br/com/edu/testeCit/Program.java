package br.com.edu.testeCit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Program {
    public static void main(String[] args) {

        int[] numerosAleatorios = new int[15];

        // Criação de Vetor

        Vector<Integer> numerosAleatorioss = new Vector<>(15);

        // Adicionando elementos ao vetor

        for (int i = 0;i < 15;i++){
            int numeroGerado = (int) (Math.random() * 10);
            numerosAleatorios[i] = numeroGerado;
        }
        System.out.println("------------------------------");
        System.out.println("Vetor gerado");
        System.out.println("------------------------------");

        // exibindo Vetor

        System.out.println("Array gerado: " + numerosAleatorios);

        // orndenando vetor
        Arrays.sort(numerosAleatorios);

        Arrays.stream(numerosAleatorios).distinct().forEach(System.out::println);

        numerosAleatorioss.sort((n,v) -> {
            int result = n > v? 1: n < v? -1: 0;
            return result;
        });

    //      for (int x = 0);



    }
}

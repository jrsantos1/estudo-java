package br.com.edu.aulas.lambdas;

import java.util.ArrayList;

public class Iteracao {
    public static void run(){

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jhonatan");
        nomes.add("Bianca");
        nomes.add("Pedro");
        nomes.add("Roger");
        nomes.add("Lucio");

        nomes.forEach(c -> System.out.println(c));


    }
}

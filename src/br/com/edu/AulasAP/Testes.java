package br.com.edu.AulasAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Testes {

    public static void main(String[] args) {
        /*String nomeCompleto = "Jhonatan Ribeiro dos Santos";

        String separado[] = nomeCompleto.split(" ");

        for(String lista: separado){
            System.out.println(lista);
        }
        System.out.println(nomeCompleto.substring(6));
*/
        HashMap<Integer, List<String>> perguntas = new HashMap<>();
        perguntas.put(0, Arrays.asList("Qual a capital do Brasil", "São Paulo", "Rio de Janeiro", "Rio Grande do Sul", "Brasília"));
        perguntas.put(1, Arrays.asList("Qual a capital do Brasil", "São Paulo", "Rio de Janeiro", "Rio Grande do Sul", "Brasília"));
        perguntas.put(2, Arrays.asList("Qual a capital do Brasil", "São Paulo", "Rio de Janeiro", "Rio Grande do Sul", "Brasília"));
        perguntas.put(3, Arrays.asList("Qual a capital do Brasil", "São Paulo", "Rio de Janeiro", "Rio Grande do Sul", "Brasília"));

        System.out.println(perguntas.size());

        for (int t = 0; t < perguntas.size(); t++){
            for (int r = 0; r < 5; r++){
                System.out.println(perguntas.get(t).get(r));
                String repostaCorreta = perguntas.get(t).get(4);
                System.out.println("A resposta correta é: " + repostaCorreta);
            }
        }

    }
}

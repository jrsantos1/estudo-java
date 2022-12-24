package br.com.edu.topicos.fundamentos.listas.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class InterseccaoDeVetores{
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(7);
        numeros.add(1);

        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(4);

        ArrayList<Integer> numeros3 = new ArrayList<>();

        numeros3 = numeros;


        for(int i: numeros3){

            boolean valida = false;

            for (int j = 0; j < numeros2.size(); j++) {
                if (numeros2.get(j) == i){
                    valida = true;
                }
            }
            if(!valida){
                numeros2.add(i);
            }
        }


        System.out.println(numeros2);

        System.out.println(numeros3);

    }
}

package br.com.edu.topicos.fundamentos.listas.collections.arraylist;

import java.util.ArrayList;

public class InterseccaoDeVetoresMetodoContains {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(5);
        array1.add(7);
        array1.add(1);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(2);
        array2.add(4);

        ArrayList<Integer> numeros3 = new ArrayList<>();

        // interseccao entro dois arrays
        for (int i : array1){
            if (!array2.contains(i)){
                array2.add(i);
            }
        }

        ArrayList<Integer> array3 = new ArrayList<>();

        System.out.println(array2);

        System.out.println(array1);

    }
}

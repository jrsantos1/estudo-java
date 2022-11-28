package br.com.edu.topicos.fundamentos.listas;

import java.util.HashSet;

public class Set {
    // não ordenado por padrao
    // não indexado
    // não aceita repeticao

    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add('X');
        conjunto.add("teste");
        conjunto.add(1.2);
        conjunto.add(true);

        System.out.println("o tamanho do conjunto é " + conjunto.size());

        System.out.println(conjunto.remove("teste")); // remove e retorna true ou false

        System.out.println(conjunto.contains("teste")); // verificar se contém valor e retorna true ou false

        java.util.Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // concatena os dois conjuntos

        conjunto.retainAll(nums); // mantém apenas valores em comum

        System.out.println(conjunto);

    }
}

package br.com.edu.aulas.fundamentos.listas.sets;

import java.util.HashMap;

public class MapHash {
    public static void main(String[] args) {
        HashMap<String, String> capitaisBrasil = new HashMap<String, String>();
        capitaisBrasil.put("São Paulo", "São Paulo");
        capitaisBrasil.put("Tocantins","Palmas");
        System.out.println(capitaisBrasil);
        capitaisBrasil.size();
        for (String k: capitaisBrasil.keySet()){
            System.out.println(k);
        }
        for (String v: capitaisBrasil.values()){
            System.out.println(v);
        }
    }
}

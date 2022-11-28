package br.com.edu.topicos.fundamentos.listas.sets;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorTeste {
    public static void run(){
        HashSet<String> lista = new HashSet<String>();
        lista.add("Jhonatan");
        lista.add("Pedro");
        lista.add("Marcela");
        lista.add("Patricia");

        Iterator<String> novalista = lista.iterator();

        // utilizando iterator

        while (novalista.hasNext()){
            System.out.println(novalista.next());
        }

        // utilizando for

        for (String i: lista){
            System.out.println(i);
        }


    }
}

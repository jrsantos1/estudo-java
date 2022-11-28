package br.com.edu.topicos.generics;

import java.util.List;

public class MethodGenerics {
    public static <T> T getLastElement(List<T> lista){
       return lista.get(lista.size() - 1);
    }
}

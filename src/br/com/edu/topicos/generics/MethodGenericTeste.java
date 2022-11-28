package br.com.edu.topicos.generics;

import java.util.Arrays;
import java.util.List;

public class MethodGenericTeste {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Jhonatan", "Favio");
        String getResultado = MethodGenerics.getLastElement(nomes);
        System.out.println(getResultado);

    }
}

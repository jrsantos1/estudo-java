package br.com.edu.topicos.lambdas.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Carlos", "Cezar", "Maicon", "camila");
        lista.stream().forEach((x) -> System.out.println(x));
        ArrayList<String> novaLista = (ArrayList<String>) lista.stream().map((x) -> { return x + "";});

        for(String valor: novaLista){
            System.out.println(valor);
        }

    }
}

package br.com.edu.topicos.orientacao_objeto.matematica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Mat<T> {
    public void soma(Double... valores){
        List<Double> lista = new ArrayList<>();
        for (Double valor: valores){
            lista.add(valor);
        }

        Optional<Double> resultado = lista.stream().reduce((a, b) -> a + b);

        if (resultado.isPresent()){
            System.out.println(resultado.get());
        }


    }
}

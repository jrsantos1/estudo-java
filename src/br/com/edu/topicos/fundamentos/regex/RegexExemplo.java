package br.com.edu.topicos.fundamentos.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExemplo {
    public static void main(String[] args) {
        Pattern padrao = Pattern.compile("Jhonatan", Pattern.CASE_INSENSITIVE);
        Matcher buscaPadrao = padrao.matcher("O tal do Jhonatan");
        boolean resultadoBusca = buscaPadrao.find();

        if (resultadoBusca){
            System.out.println("Busca realizada com sucesso");
        }else {
            System.out.println("Busca não realizada com sucesso");
        }
    }
}

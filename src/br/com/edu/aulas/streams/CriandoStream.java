package br.com.edu.aulas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {

    public static void main(String[] args) {

        // criando consumidar com metodo de referencia.

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Golang " , "PHP \n");

        // exibir a stream através do foreach, passando o consumer criado como parametro

        langs.forEach(print);

        String[] maisLangs = {"Python ", "Lisp ", "Perl \n"};

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        // criando Stream a paritr de collections

        List<String> outrasLangs = Arrays.asList("C", "Kotlin" , "Lua");
        outrasLangs.parallelStream().forEach(print);

        // criando stream a partir do generete sem ordenação

        Stream.generate(() -> "a").forEach(print);

        // criando a partir do iterate

        Stream.iterate(0, n -> n + 1).forEach(System.out::println);

    }

}

package br.com.edu.alura.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Java Básico", 40));
        cursos.add(new Curso("Java Básico 2", 35));
        cursos.add(new Curso("Java Intermediário",  30));
        cursos.add(new Curso("Java Avançado", 20));

        cursos.sort(Comparator.comparing(c -> c.getAlunos()));

        cursos.stream().filter(c -> c.getAlunos() >= 20).forEach(System.out::println);

        int soma = cursos.stream().mapToInt(Curso::getAlunos).sum();

        System.out.println("O resultado da soma é: " + soma);

         cursos.stream().filter(curso -> curso.getAlunos() >= 30)
                .findAny()
                .ifPresent(c -> System.out.println("d"));

         cursos = cursos.stream().filter(c -> c.getAlunos() > 30).collect(Collectors.toList());
        System.out.println("Parte 02");
         cursos.forEach(System.out::println);
    }

}

package br.com.edu.aulas.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFiltro {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Roberto", 5.8);
        Aluno a2 = new Aluno("Pedro", 6.8);
        Aluno a3 = new Aluno("Emilly", 7.9);
        Aluno a4 = new Aluno("Lucas", 8.9);
        Aluno a5 = new Aluno("Francisco", 9.9);
        Aluno a6 = new Aluno("Marcelly", 4.9);
        Aluno a7 = new Aluno("Jussara", 6.9);

        List<Aluno> alunos = Arrays.asList(a1, a2,a3,a4,a5,a6,a7);

        alunos.stream().filter(n -> n.nota > 7).forEach(n -> System.out.println("Parabés, " + n.nome +
                " você foi aprovado com nota igual a " + n.nota ));


    }
}

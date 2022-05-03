package br.com.edu.aulas.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Roberto", 5.8);
        Aluno a2 = new Aluno("Pedro", 6.8);
        Aluno a3 = new Aluno("Emilly", 7.9);
        Aluno a4 = new Aluno("Lucas", 8.9);
        Aluno a8 = new Aluno("Roberto", 5.8);
        Aluno a9 = new Aluno("Pedro", 6.8);
        Aluno a10 = new Aluno("Emilly", 7.9);
        Aluno a11 = new Aluno("Lucas", 8.9);
        Aluno a5 = new Aluno("Francisco", 9.9);
        Aluno a6 = new Aluno("Marcelly", 4.9);
        Aluno a7 = new Aluno("Jussara", 6.9);

        List<Aluno> alunos = Arrays.asList(a1, a2,a3,a4,a5,a6,a7,a8,a9,a10,a11);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) ->
        {
            if (aluno1.nota > aluno2.nota) return 1;
            if (aluno1.nota < aluno2.nota) return -1;
            return 0;
        };
        System.out.println("Exibe a melhor nota:");
        System.out.println(alunos.stream().max(melhorNota).get());

        // exclui valores repertido e limita a exibição em no maximo 4 elementos e sortei os elementos
        alunos.stream().distinct().sorted(melhorNota.reversed()).forEach(System.out::println);

        // takeWhile



    }
}

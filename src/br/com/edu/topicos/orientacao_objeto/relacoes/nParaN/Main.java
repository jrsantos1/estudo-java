package br.com.edu.topicos.orientacao_objeto.relacoes.nParaN;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Jhonatan Ribeiro dos Santos");
        Aluno aluno2 = new Aluno("Pedro Vasconcelos");
        Aluno aluno3 = new Aluno("Amanda Candido Mendes");
        Aluno aluno4 = new Aluno("Francisco Amaterasu");

        Curso curso1 = new Curso("Web Design 2023");
        Curso curso2 = new Curso("Java Completo 2024");
        Curso curso3 = new Curso("Bootstrap para java");
        Curso curso4 = new Curso("Ilustrator 2025");

        aluno1.adicionaCurso(curso1);
        aluno1.adicionaCurso(curso2);
        aluno1.adicionaCurso(curso2);
        aluno1.adicionaCurso(curso4);

        ArrayList<Curso> cursos = (ArrayList<Curso>) aluno1.getCursos();

        System.out.println("Os cursos do "+ aluno1.getNome() + " são: ");

        cursos.forEach(c -> System.out.println(c.getNome()));








    }
}

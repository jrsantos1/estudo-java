package br.com.edu.aulas.oo.relacoes.nParaN;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Curso> cursos = new ArrayList<Curso>();

    Aluno(String nome){
        this.nome = nome;
    }

    void criaAluno (String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void adicionaCurso(Curso curso){
        this.cursos.add(curso);
        curso.adicionarAluno(this);
    }

    public List<Curso> getCursos(){
        return this.cursos;
    }

}

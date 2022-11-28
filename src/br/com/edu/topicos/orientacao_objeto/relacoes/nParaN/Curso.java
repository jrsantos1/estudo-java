package br.com.edu.topicos.orientacao_objeto.relacoes.nParaN;

import java.util.ArrayList;
import java.util.List;

public class Curso {
   final private String nome;
   final private List<Aluno> alunos = new ArrayList<Aluno>();

    Curso(String nome){
       this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        //aluno.adicionaCurso(this);
    }


}
